package payment;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardPaymentStrategyTest {
    private CreditCardPaymentStrategy CreditCardPayment = new CreditCardPaymentStrategy();

    @Test
    void pay() {
        assertTrue(CreditCardPayment.pay(1));
    }
}