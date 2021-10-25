import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {
    private Flower flower;
    private FlowerPack flowerPack;
    private FlowerBucket flowerBucket;
    private Store store;

    @BeforeEach
    void setUp() {
        flower = new Flower();
        flower.setPrice(20);
        flowerPack = new FlowerPack();
        flowerPack.setFlower(flower);
        List<FlowerPack> flowerPacks = new ArrayList<FlowerPack>();
        flowerPacks.add(flowerPack);
        flowerBucket = new FlowerBucket();
        flowerBucket.addFlowerPack(flowerPack);
        List<FlowerBucket> flowerBuckets = new ArrayList<FlowerBucket>();
        flowerBuckets.add(flowerBucket);
        store = new Store(flowerBuckets);
    }

    @Test
    void search() {
        assertEquals(flowerBucket, store.search(20));
    }
}