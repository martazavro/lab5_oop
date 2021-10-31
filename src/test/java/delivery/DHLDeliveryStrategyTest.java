package delivery;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DHLDeliveryStrategyTest {
    DHLDeliveryStrategy delivery = new DHLDeliveryStrategy();

    @Test
    void deliver() {
        assertEquals(delivery.deliver(new ArrayList<>()), true);
    }
}