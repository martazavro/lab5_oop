package flowerstore;

import flowerstore.Flower;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class FlowerPack {
    private int amount;
    private Flower flower;

    public double getPrice() {
        return amount * flower.getPrice();
    }

    public FlowerPack() {
    }

}