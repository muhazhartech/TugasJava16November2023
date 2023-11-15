import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Initialize a HashMap named fruitBowl
        HashMap<String, String> fruitBowl = new HashMap<String, String>();

        // Add elements to the fruitBowl
        addElements(fruitBowl);

        // Display elements in the fruitBowl
        displayElements(fruitBowl);

        // Test the findElement method
        findElement(fruitBowl, "Banana");
    }

    static void addElements(HashMap<String, String> fruitBowl) {
        fruitBowl.put("Apple", "Green");
        fruitBowl.put("Cherry", "Red");
        fruitBowl.put("Orange", "Orange");
        fruitBowl.put("Banana", "Yellow");
        fruitBowl.put("Apple", "Red"); // This will override the previous value for "Apple"
    }

    static void displayElements(HashMap<String, String> fruitBowl) {
        System.out.println("Contents of fruitBowl:");
        for (HashMap.Entry<String, String> fruit : fruitBowl.entrySet()) {
            System.out.println("Fruit: " + fruit.getKey() + " - Color: " + fruit.getValue());
        }
    }

    static void findElement(HashMap<String, String> fruitBowl, String fruit) {
        if (fruitBowl.containsKey(fruit)) {
            System.out.println("The " + fruit + " is " + fruitBowl.get(fruit));
        } else {
            System.out.println("There is no " + fruit + " in the bowl");
        }
    }
}

