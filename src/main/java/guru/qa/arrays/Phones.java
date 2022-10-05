package guru.qa.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Phones {

    HashMap<String, List<String>> phones = new HashMap<>();

    public void addNewModel(String manufacturer,String model) {
        if (phones.get(manufacturer) != null) {
            List<String> models = phones.get(manufacturer);
            models.add(model);
            phones.put(manufacturer, models);
        }
        else  {
            List<String> models = new ArrayList<>();
            models.add(model);
            phones.put(manufacturer, models);
        }

        System.out.println("У производителя " + manufacturer + " появилась модель " + model);
    }

    public void findAllModelsByManufacturer(String manufacturer) {
        List<String> models = phones.get(manufacturer);
        System.out.println("У производителя " + manufacturer + " есть модели:");

        for (String s : models) {
            System.out.println(s);
        }
    }

}
