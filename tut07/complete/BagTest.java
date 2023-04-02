package tutorial.tut7.complete;

/**
 *  A class to initialize a bag with default capacity (30)
 */
public class BagTest {

    public static void main(String[] args) {
        BagInterface<String> carBag = new ArrayBag<String>();
        System.out.println("Initial bag size: " + carBag.getCurrentSize());
        System.out.println("Before adding objects: isEmpty() - " + carBag.isEmpty());
        System.out.println("Adding 5 new objects ...");
        carBag.add("TOYOTA");
        carBag.add("MERCEDES");
        carBag.add("HYUNDAI");
        carBag.add("FORD");
        carBag.add("PEUGEOT");
        System.out.println("After adding objects: isEmpty() - " + carBag.isEmpty());
        System.out.println("Current bag size: " + carBag.getCurrentSize());
        System.out.println("Removing 1 existing object ...");
        carBag.remove("FORD");
        System.out.println("Updated bag size: " + carBag.getCurrentSize());
        System.out.println("Current frequency of MERCEDES: " + carBag.getFrequencyOf("MERCEDES"));
        System.out.println("Adding 1 occurrence of MERCEDES ...");
        carBag.add("MERCEDES");
        System.out.println("Updated frequency of MERCEDES: " + carBag.getFrequencyOf("MERCEDES"));
        System.out.println("Checking whether bag contains HYUNDAI: " + carBag.contains("HYUNDAI"));
        System.out.println("Removing the occurrence of HYUNDAI ...");
        carBag.remove("HYUNDAI");
        System.out.println("Now re-checking whether bag still contains HYUNDAI: " + carBag.contains("HYUNDAI"));
        System.out.println("Removing all entries from the bag");
        carBag.clear();
        System.out.println("Final bag size: " + carBag.getCurrentSize());
        System.out.println("After removing all objects: isEmpty() - " + carBag.isEmpty());
    }
}
