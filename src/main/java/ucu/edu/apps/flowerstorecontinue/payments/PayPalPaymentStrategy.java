package ucu.edu.apps.flowerstorecontinue.payments;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class PayPalPaymentStrategy implements Payment {
    @Override
    public boolean pay(double price) {
        if (price > 0) {
            System.out.printf("The price of %s is paid using PayPal.%n", price);
            return true;
        }
        System.out.println("You have not purchased anything!");
        return false;
    }
}
