package ucu.edu.apps.flowerstorecontinue;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket extends Item {
    private List<FlowerPack> flowerPacks = new ArrayList<>();

    public void add(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }

    @Override
    public double getPrice() {
        double price = 0;
        for (int i = 0; i < flowerPacks.size(); i++) {
            FlowerPack currentFlowerPack = flowerPacks.get(i);
            price += currentFlowerPack.getPrice();
        }
        return price;
    }
}

