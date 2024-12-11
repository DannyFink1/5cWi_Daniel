package at.fid.shop.products;

public class Shoe implements Product {

    private String Name;
    private int price;
    private int size;

    public Shoe(String Name, int price, int size) {
        this.Name = Name;
        this.price = price;
        this.size = size;
    }

    @Override
    public String getName() {
        return this.Name;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return this.Name + " " + this.price + " " + this.size;
    }
}
