package flowerstore;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    public List<FlowerPack> flowerPackList = new ArrayList<>();

    public double getPrice() {
        double price = 0;
        for (FlowerPack flowerPack: flowerPackList) {
            price += flowerPack.getPrice();
        }
        return price;
    }

    public void addFlowerPack(FlowerPack flowerPack){
        this.flowerPackList.add(flowerPack);
    }
}