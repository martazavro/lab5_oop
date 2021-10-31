package payment;

public class CreditCardPaymentStrategy implements Payment{
    @Override
    public boolean pay(double price) {
        System.out.println("You paid by credit card successfully.");
        return true;
    }
}