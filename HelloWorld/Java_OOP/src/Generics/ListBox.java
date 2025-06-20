package Generics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ListBox {
    public static <T> ArrayList<T> createList( T[] array) {
        ArrayList<T> list = new ArrayList<>();
        for (T item : array) {
            list.add(item);
        }
        return list;
    }
    public static <T> void readList(ArrayList<T> list) {
        for (T item : list) {
            System.out.println("Readed from Generic: " +item);
        }
    }
}
