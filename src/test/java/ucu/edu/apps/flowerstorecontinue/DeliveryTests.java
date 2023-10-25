package ucu.edu.apps.flowerstorecontinue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ucu.edu.apps.flowerstorecontinue.deliveries.DHLDeliveryStrategy;
import ucu.edu.apps.flowerstorecontinue.deliveries.Delivery;
import ucu.edu.apps.flowerstorecontinue.deliveries.PostDeliveryStrategy;


public class DeliveryTests {

    private Delivery deliveryDHL;
    private Delivery post;



    @BeforeEach
    public void init() {
        deliveryDHL = new DHLDeliveryStrategy();
        post = new PostDeliveryStrategy();
    }


    @Test
    public void deliveryDHLProcess() {
        boolean underDelivery = deliveryDHL.deliver();
        assert (underDelivery);
    }

    @Test
    public void postDeliveryProcess() {
        boolean postDelivery = post.deliver();
        assert (postDelivery);
    }

}
