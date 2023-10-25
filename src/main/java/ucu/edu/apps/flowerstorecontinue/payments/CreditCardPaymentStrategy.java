package ucu.edu.apps.flowerstorecontinue.payments;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class CreditCardPaymentStrategy implements Payment {
    @Override
    public boolean pay(double price) {
        if (price > 0) {
            System.out.printf("The price of %s is paid "
                    + "using Credit Card.%n", price);
            return true;
        }
        System.out.println("Purchase is not fulfilled");
        return false;
    }
}