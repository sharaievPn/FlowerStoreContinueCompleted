package ucu.edu.apps.flowerstorecontinue;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Item {
    private String description;
    private double price;
}
