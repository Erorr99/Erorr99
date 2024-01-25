package linklisthw;

/**
 *
 * @author stacia
 */
public class Product {
    public int id;
    public String name;
    public int price;
    public int quantity;

    Product(int id, String name, int price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String priceFmt() {
        return String.format("%,d", this.price);
    }
    public String quatityFmt() {
        return String.format("%,d", this.quantity);
    }
}
