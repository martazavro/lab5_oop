package delivery;

import items.Item;
import java.util.List;

public class PostDeliveryStrategy implements Delivery {

    @Override
    public boolean deliver(List<Item> items) {
        System.out.println("Successful delivery by Post");
        return true;
    }
}