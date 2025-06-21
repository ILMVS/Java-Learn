import java.util.function.*;

public class FunctionsExample {
    public static void main(String[] args) {
        //Consumer is a functional interface that takes a single argument and returns no result.
        Consumer<String> consumer = (String s) -> {
            System.out.println("Hello, " + s);
        };
        consumer.accept("World");

        //BiConsumer is a functional interface that takes two arguments and returns no result.
        BiConsumer<String,String> biConsumer = (String s1, String s2) -> {
            System.out.println("Hello, " + s1 + " and " + s2);
        };
        biConsumer.accept("Alice", "Bob");

        Consumer<String> consumer2 = System.out::println;

        // Supplier is a functional interface that does not take any arguments and returns a result.
        Supplier<String> supplier = () -> "Hello, World!";
        System.out.println(supplier.get());

        // Function is a functional interface that takes one argument and returns a result. combination of consumer and supplier.
        Function<String,String> function = (String s) ->{
            return "Hello, " + s;
        };

        System.out.println(function.apply("World"));

        // BiFunction is a functional interface that takes two arguments and returns a result.
        BiFunction<String, String, String> biFunction = (String s1, String s2) -> {
            return "Hello, " + s1 + " and " + s2;
        };

        // Predicate is a functional interface that takes one argument and returns a boolean value.
        Predicate <String> isLongerThan5Chars = (String s) -> {
            return s.length() > 5;
        };

        System.out.println(isLongerThan5Chars.test("Hello")); // false

        // BiPredicate is a functional interface that takes two arguments and returns a boolean value.
        BiPredicate <String, String> areEqual =  String::equals;
        System.out.println(areEqual.test("Hello", "Hello")); // true

        BiPredicate <String, String> areNotEqual = (String s1, String s2) -> {
            return !s1.equals(s2);
        };
    }
}
