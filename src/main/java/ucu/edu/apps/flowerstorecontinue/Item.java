package ucu.edu.apps.flowerstorecontinue;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Item {
    @Setter
    private String description;
    private double price;
    public String getDescription() {
        return description;
    }
    abstract double getPrice();
}
