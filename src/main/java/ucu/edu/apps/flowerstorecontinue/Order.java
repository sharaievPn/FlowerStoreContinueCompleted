package ucu.edu.apps.flowerstorecontinue;

import ucu.edu.apps.flowerstorecontinue.deliveries.Delivery;
import ucu.edu.apps.flowerstorecontinue.payments.Payment;

import java.util.LinkedList;

public class Order {
    private LinkedList<Item> items;
    private Payment payment;
    private Delivery delivery;
    public Order() {
        items = new LinkedList<>();
    }

    void addItem(Item newItem) {
        items.add(newItem);
    }

    double calculateTotalPrice() {
        double price = 0;
        for (Item currentItem: items) {
            price += currentItem.getPrice();
        }
        return price;
    }

    void removeItem(Item itemToRemove) {
        items.remove(itemToRemove);
    }

    void processOrder() {
        payment.pay(calculateTotalPrice());
        delivery.deliver();
    }

    void setPaymentStrategy(Payment paymentMethod) {
        payment = paymentMethod;
    }

    void setDeliveryStrategy(Delivery deliveryMethod) {
        delivery = deliveryMethod;
    }
}
