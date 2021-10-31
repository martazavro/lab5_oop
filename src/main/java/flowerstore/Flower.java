package flowerstore;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

@Getter
@Setter
public class Flower {
    private FlowerType flowerType;
    private double price;
    private double sepalLength;
    private int[] color;

    public Flower() {
    }

    public void setColor(int[] color) {
        this.color = Arrays.copyOf(color, color.length);
    }
}