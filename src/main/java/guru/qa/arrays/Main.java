package guru.qa.arrays;

public class Main {

    public static void main(String[] arg) {

//        Операции с классом Students
        System.out.println("------------------------");
        System.out.println("Операции с классом Students");

        Students students = new Students();
        students.addStudent("Сережа");
        students.findStudent("Сережа");

//        Операции с классом Phones
        System.out.println("------------------------");
        System.out.println("Операции с классом Phones");

        Phones phones = new Phones();
        phones.addNewModel("Samsung", "S7");
        phones.addNewModel("Samsung", "S8");
        phones.findAllModelsByManufacturer("Samsung");

//        Операции с классом Cells
        System.out.println("------------------------");
        System.out.println("Операции с классом Cells");

        Cells cells = new Cells();
        cells.newCell("A1");
        cells.newCell("A2");
        cells.killCell("A2");
        cells.showAllLiveCell();

//        Операции с классом Zoo
        System.out.println("------------------------");
        System.out.println("Операции с классом Zoo");

        Zoo zoo = new Zoo();
        zoo.newAnimal("Львы");
        zoo.newAnimal("Медведи");
        zoo.newAnimal("Львы");
        zoo.showAll();
    }
}
