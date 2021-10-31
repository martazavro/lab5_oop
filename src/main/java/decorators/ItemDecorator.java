package decorators;

import items.Item;

public abstract class ItemDecorator extends Item {
    private final Item item;
    public ItemDecorator(Item item){
        this.item = item;
    }

    @Override
    public double getPrice() {
        return item.getPrice();
    }

    @Override
    public void getDescription() {
        item.getDescription();
    }
}