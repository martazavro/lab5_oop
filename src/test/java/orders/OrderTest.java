package orders;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import users.Receiver;
import users.User;
import flowerstore.Flower;
import flowerstore.FlowerPack;


class OrderTest {
    User receiver = new Receiver();
    User receiver2 = new Receiver();
    private Flower flower;
    private Flower flower2;

    private FlowerPack pack;
    private FlowerPack pack2;

    Order order = new Order();


    @BeforeEach
    void setUp() {
        flower = new Flower();
        flower.setPrice(10);

        flower2 = new Flower();
        flower2.setPrice(100);

        pack = new FlowerPack();
        pack.setFlower(flower);
        pack.setAmount(10);

        pack2 = new FlowerPack();
        pack2.setFlower(flower2);
        pack2.setAmount(30);

        order.addUser(receiver);
        order.addUser(receiver2);
    }

    @Test
    void orderId() {
        assertEquals(2, order.getID());
        order.removeUser(receiver2);
        assertEquals(1, order.getID());
    }
}