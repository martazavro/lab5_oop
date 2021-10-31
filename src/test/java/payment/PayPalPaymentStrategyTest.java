package payment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PayPalPaymentStrategyTest {
    private PayPalPaymentStrategy payPalPayment = new PayPalPaymentStrategy();

    @Test
    void pay() {
        assertEquals(true, payPalPayment.pay(1));
    }
}