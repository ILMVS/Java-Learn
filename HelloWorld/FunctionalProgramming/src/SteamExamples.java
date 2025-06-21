import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SteamExamples {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // Stream is a sequence of elements supporting sequential and parallel aggregate operations.
        //stream() is a method that creates a sequential Stream with the elements of this collection.
        // Creating a Stream from a List
        Stream<String> colorStream = colors.stream();

//        boolean result = colorStream.map(String::toUpperCase)
//                .filter(color -> color.startsWith("R"))
//                .peek(System.out::println)
////                .forEach(System.out::println)
//                .anyMatch(color -> color.equals("Red"));

        colorStream.map(String::toUpperCase)
                .peek(System.out::println)
                .flatMap(color -> Stream.of(color, color + " Color"));

        //stream of streams in a single stream
                Stream<Stream<String>> nestedStream = Stream.of(
                        Stream.of("Red", "Green"),
                        Stream.of("Blue", "Yellow")
                );

        //flatMap() is used to flatten the nested streams into a single stream.
        Stream<String> flattenedStream = nestedStream.flatMap(s -> s);

        // STREAM OPERATIONS

        //INTERMEDIATE OPERATIONS
        //map() is an intermediate operation that transforms each element of the stream by applying a function to it.
        //filter() is an intermediate operation that filters elements of the stream based on a predicate (a condition).
        // flatMap() is an intermediate operation that flattens a stream of streams into a single stream.
        //peek() is an intermediate operation that allows you to perform a side-effect action on each element of the stream without modifying the stream itself.

        //TERMINAL OPERATIONS
        //forEach() is a terminal operation that performs an action for each element of the stream.
        //anyMatch() is a terminal operation that checks if any element of the stream matches the given predicate.

        //collect() is a terminal operation that collects the elements of the stream into a collection, such as a List or Set.
        List<String> filteredColors = colors.stream()
                .filter(color -> color.startsWith("R"))
                .collect(Collectors.toList());
        System.out.println("Filtered Colors: " + filteredColors);

        //sorted() is an intermediate operation that sorts the elements of the stream.
        List<String> sortedColors = colors.stream()
                .sorted(Comparator.naturalOrder())
                .toList();
    }
}
