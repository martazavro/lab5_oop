
import items.*;
import java.util.ArrayList;
import delivery.Delivery;
import payment.Payment;
import lombok.Getter;

@Getter
public class Order {
    private ArrayList<Item> items = new ArrayList<>();
    private Payment payment;
    private Delivery delivery;

    public void setPayment(Payment myPayment){
        payment = myPayment;
    }
    public void setDelivery(Delivery myDelivery){
        delivery = myDelivery;
    }
    public double Price(){
        int i;
        double price = 0;

        for (i=0;i< items.size();i++){
            price+=items.get(i).getPrice();
        }
        return price;
    }

    public void Ordering(){
        delivery.deliver(items);
        payment.pay(this.Price());

    }
    public void addItem(Item item){
        items.add(item);
    }
    public void removeItem(Item item){
        items.remove(item);
    }}

