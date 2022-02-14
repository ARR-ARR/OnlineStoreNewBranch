package store;

public abstract class Product {

    private String typeProduct;
    private String brand;
    private int price;
    private String description;


    public Product(String typeProduct, String brand, int price, String description) {
        this.typeProduct = typeProduct;
        this.brand = brand;
        this.price = price;
        this.description = description;
    }

    public Product() {
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public String getTypeProduct() {
        return typeProduct;
    }

    @Override
    public String toString() {
        return
                "Type Product: '" + typeProduct + '\'' +
                ", brand: '" + brand + '\'' +
                ", price: " + price +
                ", description (" + description + ')';
    }
}
