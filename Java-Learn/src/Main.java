public class Main {
    public static void main(String[] args) {
        //primitive types
        int age = 25;
        double price = 19.99;
        boolean isActive = true;
        char grade = 'A';

        //reference types
        String name = "John Doe";
        Integer number = 42;
        Integer[] numbers = {1, 2, 3, 4, 5};
        int[] scores = {90, 85, 88};
        String[] fruits = {"Apple", "Banana", "Cherry"};

        String hi = "Hello, World!";
        System.out.println("hi = " + hi.toUpperCase());

        //rules to add variables
        //to add a new spelling, you can go to file -> settings -> editor -> spelling (intellij IDEA)

        //how to add a comment // for single line comment /**/ for multi-line comment



        //string
        String text = "Hello, World!"; // sequence of characters
        String multilineText = "This is a\nmultiline string"; // string with newline character

        //array
        int[] numbersArray = {1, 2, 3, 4, 5}; // array of integers
        String[] stringArray = {"Apple", "Banana", "Cherry"}; // array of strings

        //list
        java.util.List<String> stringList = new java.util.ArrayList<>();
        stringList.add("Apple");

        stringList.add("Banana");
        stringList.add("Cherry");
        System.out.println("String List: " + stringList);

        //map
        java.util.Map<String, Integer> stringIntegerMap = new java.util.HashMap<>();
        stringIntegerMap.put("One", 1);
        stringIntegerMap.put("Two", 2);
        stringIntegerMap.put("Three", 3);
        System.out.println("String-Integer Map: " + stringIntegerMap);
        //set
        java.util.Set<String> stringSet = new java.util.HashSet<>();
        stringSet.add("Apple");
        stringSet.add("Banana");
        stringSet.add("Cherry");
        System.out.println("String Set: " + stringSet);

        //enum
        enum Day {
            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
        }
        Day today = Day.MONDAY;
        System.out.println("Today is: " + today);

        //null
        String nullableString = null; // variable that can hold a null value

        //final variables
        final int MAX_VALUE = 100; // constant value that cannot be changed
        System.out.println("Max Value: " + MAX_VALUE);

        //variable scope
        {
            int localVariable = 10; // local variable within this block
            System.out.println("Local Variable: " + localVariable);
        }
        // System.out.println("Local Variable: " + localVariable); // This would cause an error because localVariable is out of scope
        //type casting
        double doubleValue = 9.78;
        int intValue = (int) doubleValue; // explicit type casting from double to int
        System.out.println("Double Value: " + doubleValue);
        System.out.println("Int Value after casting: " + intValue);

        //type promotion
        int a = 5;
        long b = 10L;
        double c = a + b; // int and long are promoted to double
        System.out.println("Type Promotion Result: " + c + " (" + ((Object) c).getClass().getSimpleName() + ")");

        //type erasure (generics)
        java.util.List<String> stringList2 = new java.util.ArrayList<>();
        stringList2.add("Hello");
        stringList2.add("World");
        for (String str : stringList2) {
            System.out.println("String from List: " + str + " (" + ((Object) str).getClass().getSimpleName() + ")");
        }
    }
}