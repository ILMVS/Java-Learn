package Person;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapPersonExample {
    public static void main(String[] args) {
        // Create a Person object
        Map<String, String> personMap = new TreeMap<>(Comparator.reverseOrder());
        personMap.put("firstName", "John");
        personMap.put("lastName", "Doe");
        personMap.put("age", "30");
        personMap.put("city", "New York");

        // Print the person details
        System.out.println("Person Details:");
        System.out.println("First Name: " + personMap.get("firstName"));
        System.out.println("Last Name: " + personMap.get("lastName"));
        System.out.println("Age: " + personMap.get("age"));
        System.out.println("City: " + personMap.get("city"));
        // Iterate through the map and print all entries
        System.out.println("\nAll Entries:");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Check if a specific key exists
        String keyToCheck = "age";
        if (personMap.containsKey(keyToCheck)) {
            System.out.println("\nThe key '" + keyToCheck + "' exists in the map.");
        } else {
            System.out.println("\nThe key '" + keyToCheck + "' does not exist in the map.");
        }
        // Check if a specific value exists
        String valueToCheck = "John";
        if (personMap.containsValue(valueToCheck)) {
            System.out.println("The value '" + valueToCheck + "' exists in the map.");
        } else {
            System.out.println("The value '" + valueToCheck + "' does not exist in the map.");
        }
        personMap.replace("age", "31");
        personMap.forEach((k, v) -> {
            System.out.println(k + ": " + v);
        });


    }
}
