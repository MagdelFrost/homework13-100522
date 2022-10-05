package guru.qa.arrays;

import java.util.LinkedList;
import java.util.List;

public class Students {

    List<String> names = new LinkedList<>();

    public void addStudent(String name) {
        names.add(name);

        System.out.println("Добавлен студент " + name);
    }

    public void findStudent(String name) {
        for (String s1:names) {
            if (s1.equals(name)) {
                System.out.println("Студент " + name + " найден");
            } else {
                System.out.println("Студент " + name + " ненайден");
            }
        }
    }

}
