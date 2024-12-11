package at.fid.shop.products;

public class Hat implements Product {
    private String Name;
    private int price;
    private String Form;

    public Hat(String Name, int price, String Form) {
        this.Name = Name;
        this.price = price;
        this.Form = Form;
    }

    public String getForm() {
        return this.Form;
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

        return this.Name + " " + this.price + " " + this.Form;
    }
}
