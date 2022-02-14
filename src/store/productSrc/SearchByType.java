package store.productSrc;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SearchByType {
    private List<Object> productList = new ArrayList<>();


    public void addProductList() {
        SmartPhone smartPhone = new SmartPhone();
        Laptop laptop = new Laptop();
        productList.add(laptop.getLaptopList());
        productList.add(smartPhone.getSmartPhoneList());
        System.out.println(productList);
    }

    public void searchProductByType(){
        Map<String, List<Object>> prodSearchMap = new HashMap<>();
        prodSearchMap.put("Ноутбук", productList);
        System.out.println(prodSearchMap);
    }


}
