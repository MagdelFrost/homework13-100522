package guru.qa.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cells {

    List<String> cells = new ArrayList<>();

    public void newCell(String name) {
        cells.add(name);

        System.out.println("Создана клетка с именем " + name);
    }

    public void killCell(String name) {

        for (int i = 0; i < cells.toArray().length; i++) {
            if (Objects.equals(cells.get(i), name)) {
                cells.remove(i);
            }
        }

        System.out.println("Клетка с именем " + name + " умерла");
    }

    public void showAllLiveCell() {
        System.out.println("В живых клетки:");
        for (String s : cells) {
            System.out.println(s);
        }
    }
}
