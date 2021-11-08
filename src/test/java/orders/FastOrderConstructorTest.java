package orders;
import users.Receiver;
import users.User;
import payment.*;
import flowerstore.*;
import delivery.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FastOrderConstructorTest<flower> {
    User user = new Receiver();
    private Flower flower;
    private Flower flower2;

    private FlowerPack pack;
    private FlowerPack pack2;

    private Payment payment;
    private Delivery delivery;
    FastOrderConstructor ordr = new FastOrderConstructor();
    Order order = ordr.createOrder();

    @BeforeEach
    void setUp() {
        flower = new Flower();
        flower.setPrice(10);

        flower2 = new Flower();
        flower2.setPrice(100);

        pack = new FlowerPack();

        pack2 = new FlowerPack();
    }






    @Test
    void createOrder() {
        order.notifyUsers();
        assertEquals(0, order.notifyUsers());
    }
}