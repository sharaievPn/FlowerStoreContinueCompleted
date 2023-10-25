package ucu.edu.apps.flowerstorecontinue.deliveries;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class PostDeliveryStrategy implements Delivery {
    @Override
    public boolean deliver() {
        System.out.println("The shipment is covered by Post");
        return true;
    }
}
