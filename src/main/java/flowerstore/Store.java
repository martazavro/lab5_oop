package flowerstore;

import flowerstore.FlowerBucket;

import java.util.ArrayList;
import java.util.List;

public class Store {
    List<FlowerBucket> flowerBuckets = new ArrayList<FlowerBucket>();

    public Store(List<FlowerBucket> flowerBuckets){
        this.flowerBuckets = flowerBuckets;
    }

    public FlowerBucket search(double price) {
        for (int i = 0; i < flowerBuckets.size(); i++) {
            
            if (flowerBuckets.get(i).getPrice() == price){
                return flowerBuckets.get(i);
            }
        }
        return null;
    }
}