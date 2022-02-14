package store.productSrc;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LaptopService {


    void addLaptopList(List<Laptop> laptopList) {

        Laptop acer = new Laptop("Ноутбук", "Acer", 32999, "Acer Aspire 3 A314-22-R632");
        Laptop lenovo = new Laptop("Ноутбук", "Lenovo", 37999, "Lenovo IdeaPad 3 14ADA05");
        Laptop honor = new Laptop("Ноутбук", "Honor", 37999, "Honor MagicBook X 14 i3/8/256 Space Gray");
        Laptop digma = new Laptop("Ноутбук", "Digma", 9999, "Digma Eve 10 A200");
        Laptop irbis = new Laptop("Ноутбук", "Irbis", 19999, "Irbis NB141");

        laptopList.add(acer);
        laptopList.add(lenovo);
        laptopList.add(honor);
        laptopList.add(digma);
        laptopList.add(irbis);

        /*for (Laptop listLaptop : laptopList)
            System.out.println(listLaptop);*/

    }

    void addLaptopMap(List<Laptop> laptopList) {
        Map<String, Integer> laptopMap = new HashMap<>();
        for (Laptop addLet : laptopList)
            laptopMap.put(addLet.getBrand(), addLet.getPrice());

       // System.out.println(laptopMap);
    }


}
