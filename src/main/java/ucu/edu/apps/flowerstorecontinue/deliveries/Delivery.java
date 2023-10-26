package ucu.edu.apps.flowerstorecontinue.deliveries;

import ucu.edu.apps.flowerstorecontinue.Item;

import java.util.LinkedList;

public interface Delivery {

    String deliver(LinkedList<Item> items);
}
