package ClassPractice;

import java.util.HashSet;
import java.util.Set;

public class Set011 {

    public static void main(String[] args) {
        Set<String> fruits = new HashSet();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Pinaplle");
            fruits.add("Water Melon");
        System.out.println(fruits);
        System.out.println(fruits.size());
        System.out.println(fruits.isEmpty());
        System.out.println(fruits.contains("Apple"));
        System.out.println(fruits.remove("Apple"));
        System.out.println(fruits);
        fruits.clear();
        System.out.println(fruits.isEmpty());

    }
}
