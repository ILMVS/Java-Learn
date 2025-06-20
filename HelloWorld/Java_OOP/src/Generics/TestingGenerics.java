package Generics;

import Person.Person;

import java.util.ArrayList;
import java.util.List;

import static Generics.ListBox.createList;
import static Generics.ListBox.readList;

public class TestingGenerics {
    public static void main(String[] args) {
        // Box para Integer
        Box<Integer> integerBox = new Box<>();
        integerBox.set(123);
        System.out.println("Valor en integerBox: " + integerBox.get());

        // Box para String
        Box<String> stringBox = new Box<>();
        stringBox.set("Hola Mundo");
        System.out.println("Valor en stringBox: " + stringBox.get());

        Box <Person> personBox = new Box<>();
        personBox.set(new Person("John", "Doe"));
        System.out.println("Valor en personBox: " + personBox.get());

        Person[] personList = {
            new Person("Alice", "Smith"),
            new Person("Bob", "Johnson"),
            new Person("Charlie", "Brown")
        };

        ArrayList<Person> personArrayLis = createList(personList);
        readList(personArrayLis);

        String[] stringArray = {"Hello", "World", "Generics"};
        ArrayList<String> stringArrayList = createList(stringArray);
        readList(stringArrayList);
    }
}
