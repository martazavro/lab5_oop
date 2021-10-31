package payment;

public class PayPalPaymentStrategy implements Payment{
    @Override
    public boolean pay(double price) {
        System.out.println("You paid by paypal card successfully.");
        return true;
    }
}