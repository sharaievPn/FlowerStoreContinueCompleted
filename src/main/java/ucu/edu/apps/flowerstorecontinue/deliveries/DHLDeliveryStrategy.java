package ucu.edu.apps.flowerstorecontinue.deliveries;

import lombok.AllArgsConstructor;
import ucu.edu.apps.flowerstorecontinue.Item;

import java.util.LinkedList;

@AllArgsConstructor
public class DHLDeliveryStrategy implements Delivery {
    @Override
    public String deliver(LinkedList<Item> items) {
        System.out.println("The shipment is covered by DHL");
        StringBuilder result = new StringBuilder();
        for (Item currentItem : items) {
            result.append(currentItem.getDescription());
            result.append(" ");
        }
        return result.toString().strip();
    }
}
