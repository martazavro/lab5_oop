package orders;
import items.Item;
import users.User;
import delivery.Delivery;
import payment.Payment;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private ArrayList<Item> items = new ArrayList<>();
    private Payment payment;
    private Delivery delivery;

    public Order() {
    }


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

}
    List<User> users = new ArrayList<User>();
    private static int id = 0;

    public int getID() {return id;}

    public void addUser(User user) {
        user.update(++id);
        users.add(user);}

    public void removeUser(User user) {
        id--;
        users.remove(user);}

    public byte notifyUsers(){
        for (int i=0; i<users.size(); i++){
            users.get(i).notify();
        }
        return 0;
    }

    public void order(){
        notifyUsers();}

    @Override
    public String toString() {
        return "Order{" + "items=" + items + ", payment=" + payment + ", delivery=" + delivery +'}';}
}