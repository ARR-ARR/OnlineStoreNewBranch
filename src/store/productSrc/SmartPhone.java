package store.productSrc;

import store.Product;

import java.util.ArrayList;
import java.util.List;

public class SmartPhone extends Product {

    private List<SmartPhone> smartPhoneList = new ArrayList<>();


    public SmartPhone(String typeProduct, String brand, int price, String description) {
        super(typeProduct, brand, price, description);

    }

    public SmartPhone() {
        SmartPhoneService smartPhoneService = new SmartPhoneService();
        smartPhoneService.addSmartPhoneList(smartPhoneList);
        smartPhoneService.addSmartPhomeMap(smartPhoneList);

    }

    public List<SmartPhone> getSmartPhoneList() {
        return smartPhoneList;
    }
}
