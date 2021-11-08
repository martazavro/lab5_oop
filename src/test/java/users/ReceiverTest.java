package users;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReceiverTest {
    Receiver user1 = new Receiver();
    Receiver user2 = new Receiver();
    @Test
    void getId() {
        assertEquals(0, user2.getId() - user1.getId());
    }

    @Test
    void update() {
        assertEquals("Receiver's id is 1", user1.update(1));
    }
}