import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

//    public static void addCat(List<Cat> cats, Cat addedCat) {
//        boolean isExist = false;
//        for (Cat cat : cats) {
//            if (cat.equals(addedCat)) {
//                isExist = true;
//                break;
//            }
//        }
//        if (!isExist) {
//            cats.add(addedCat);
//        }
//    }

    public static void main(String[] args) {

        Cat cat;
        try {
            cat = new Cat("Barsik", -9);
            System.out.println(cat.getAge());
        } catch (MyCustomException e) {
            System.out.println(e.getMessage());
        }

        // FileNotFoundException extends IOException extends Exception

//        try (BufferedReader bufferedReader =
//                     new BufferedReader(new FileReader("src/main/resources/NewFile.txt"))) {
//            System.out.println(bufferedReader.readLine()); //Vasya
//            System.out.println(bufferedReader.readLine()); //Petya
//            System.out.println(bufferedReader.readLine()); //Masha
//        } catch (Exception e) {
//            System.out.println("Exception!");
//        }
//
//        System.out.println("All other code");

//        Cat cat1 = new Cat("Barsik");
//        Cat cat2 = new Cat("Mursik");
//        Cat cat3 = new Cat("Pushok");
//        Cat cat4 = new Cat("Vasya");
//        Cat cat5 = new Cat("Mursik");
//
//
//        //cat2 == cat5
//        Map<Cat, Integer> catsAges = new HashMap<>();
//        catsAges.put(cat1, 7);
//        catsAges.put(cat2, 8);
//        catsAges.put(cat3, 3);
//        catsAges.put(cat4, 7);
//        catsAges.put(cat5, 7);
//
//        for (Entry entry : catsAges.entrySet()) {
//            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
//        }
    }
}