import flowerstore.Flower;
import flowerstore.FlowerBucket;
import flowerstore.FlowerPack;
import flowerstore.FlowerType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerBucketTest {
    private flowerstore.FlowerBucket FlowerBucket;
    private FlowerPack flowerPack1;
    private FlowerPack flowerPack2;

    @BeforeEach
    void setUp() {
        FlowerBucket = new FlowerBucket();
        
        flowerPack1 = new FlowerPack();
        Flower flower = new Flower();
        flower.setPrice(3);
        flower.setFlowerType(FlowerType.TULIP);
        flower.setSepalLength(5.3);
        
        flowerPack1.setFlower(flower);
        flowerPack1.setAmount(5);

        flowerPack2 = new FlowerPack();
        Flower flower2 = new Flower();
        flower2.setPrice(10);
        flower2.setFlowerType(FlowerType.ROSE);
        flower2.setSepalLength(4.0);

        flowerPack2.setFlower(flower2);
        flowerPack2.setAmount(7);
        
        
        FlowerBucket.addFlowerPack(flowerPack1);
        FlowerBucket.addFlowerPack(flowerPack2);
        

    }

    @Test
    void getPrice() {
        assertEquals(85, FlowerBucket.getPrice());
    }

    @Test
    void addFlowerPack() {
        assertEquals(2, FlowerBucket.flowerPackList.size());
    }
}