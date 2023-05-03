package pl.grzegorzworek.examples;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        String[] tab = {"Ala","has","a","cat"};
        String s0 = tab[0];

        List<String> list = new ArrayList<>();
        list.add("Ala");
        list.add("has");
        list.add("a");
        list.add("cat");
    }
}
