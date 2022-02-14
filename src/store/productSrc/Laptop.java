package store.productSrc;

import store.Product;

import java.util.ArrayList;
import java.util.List;

public class Laptop extends Product {


    private List<Laptop> laptopList = new ArrayList<>();


    public Laptop(String typeProduct, String brand, int price, String description) {
        super(typeProduct, brand, price, description);

    }

    public Laptop() {
        LaptopService laptopService = new LaptopService();
        laptopService.addLaptopList(laptopList);
        laptopService.addLaptopMap(laptopList);
    }


    public List<Laptop> getLaptopList() {
        return laptopList;
    }
}
