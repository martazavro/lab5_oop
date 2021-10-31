package delivery;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PostDeliveryStrategyTest {
    PostDeliveryStrategy delivery = new PostDeliveryStrategy();

    @Test
    void deliver() {
        assertTrue(delivery.deliver(new ArrayList<>()));
    }
}