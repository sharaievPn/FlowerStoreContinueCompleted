package ucu.edu.apps.flowerstorecontinue;

import lombok.Getter;

@Getter
public class FlowerPack {
    private Flower flower;
    private int quantity;

    public FlowerPack(Flower flower, int quantityCurrent) {
        this.flower = flower;
        this.quantity = quantityCurrent;
    }

    public void setQuantity(int quantity) {
        this.quantity = Math.max(quantity, 1);
    }

    public double getPrice() {
        return flower.getPrice() * quantity;
    }
}
