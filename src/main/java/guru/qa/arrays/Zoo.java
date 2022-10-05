package guru.qa.arrays;

import java.util.HashSet;
import java.util.Set;

public class Zoo {

    Set<String> animals = new HashSet<>();

    public void newAnimal(String species) {
        animals.add(species);

        System.out.println("Новые звери в зоопарке " + species);
    }

    public void showAll() {
        System.out.println("Сейчас в зоопарке есть:");
        for (String s : animals) {
            System.out.println(s);
        }
    }
}
