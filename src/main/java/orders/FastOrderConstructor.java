package orders;
import java.util.LinkedList;
import payment.Payment;
import delivery.Delivery;
import items.Item;


public class FastOrderConstructor {
    public Order create(LinkedList<Item> items, Payment payment, Delivery delivery){
        return new Order();
    }

    @Override
    public String toString() {
        return "This is FastOrderConstructor";
    }

    public Order createOrder() {
    return new Order();}
}