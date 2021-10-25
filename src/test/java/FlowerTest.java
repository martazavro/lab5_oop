import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerTest {
    private Flower Flower;

    @BeforeEach
    void setUp() {
        Flower = new Flower();
        Flower.setPrice(15);
        Flower.setFlowerType(FlowerType.TULIP);
        Flower.setSepalLength(5.3);

    }

    @Test
    void getFlowerType() {
        assertEquals(FlowerType.TULIP, Flower.getFlowerType());
    }

    @Test
    void getPrice() {
        assertEquals(15, Flower.getPrice());
    }

    @Test
    void getSepalLength() {
        assertEquals(5.3, Flower.getSepalLength());
    }

}