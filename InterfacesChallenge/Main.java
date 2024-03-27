package InterfacesChallenge;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player adam = new Player("Adam", 10, 100);
        System.out.println(adam.toString());
        saveObject(adam);

        adam.setHitPoints(20);
        System.out.println(adam);
        System.out.println("==========");
        adam.setWeapon("Harmer");
        saveObject(adam);
        System.out.println("===============");
//        loadObject(adam);
        System.out.println(adam);

        ISaveable warewolve = new Monster("warewolve", 40, 200);

        System.out.println(((Monster) warewolve).getStrength());
        System.out.println(warewolve);
        saveObject(warewolve);

    }
    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "0 to enter string\n" +
                "1 to quit");
        while (!quit) {
            System.out.println("Choose an option");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;

            }
        }
        return values;
    }


    public static void saveObject(ISaveable objectToSave) {
        for (int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println("saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    public static void loadObject(ISaveable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}


