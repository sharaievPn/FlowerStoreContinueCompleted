package ucu.edu.apps.flowerstorecontinue;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor @Getter
@NoArgsConstructor
public class Flower {
    @Getter
    private double sepalLength;
    @Getter
    private double price;
    @Getter
    private FlowerColor color;

    public String getColor() {
        return color.toString();
    }
}
