package store.productSrc;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SmartPhoneService {

    void addSmartPhoneList(List<SmartPhone> smartPhoneList){

        SmartPhone samsung = new SmartPhone("Cмартфон", "Samsung", 14999,
                "Модель-Galaxy, 16ГБ");
        SmartPhone dexp440 = new SmartPhone("Смартфон", "DEXP440", 3199,
                "Модель- A440, 8ГБ, розовый");
        SmartPhone dexpG450 = new SmartPhone("Смартфон", "DEXP", 3199,
                "Модель- G450, 8ГБ, серый");
        SmartPhone bq = new SmartPhone("Смартфон", "BQ", 3999,
                "Модель- 4030G, 16ГБ, черный, камера 2Мп");
        SmartPhone itelA17 = new SmartPhone("Смартфон", "Itel", 4199,
                "Модель- A17, 16ГБ, голубой, камера 5Мп");

        smartPhoneList.add(samsung);
        smartPhoneList.add(dexp440);
        smartPhoneList.add(dexpG450);
        smartPhoneList.add(bq);
        smartPhoneList.add(itelA17);

        /*for (SmartPhone listSP : smartPhoneList)
            System.out.println(listSP);*/

    }

    void addSmartPhomeMap(List<SmartPhone> smartPhoneList) {
        Map<String, Integer> smartPhoneMap = new HashMap<>();
        for (SmartPhone addSP : smartPhoneList)
            smartPhoneMap.put(addSP.getBrand(), addSP.getPrice());


       // System.out.println(smartPhoneMap);

    }
}
