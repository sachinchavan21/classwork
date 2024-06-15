package ClassPractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class collection008 {

    public static void main(String[] args) {

        List<Integer> list11 = new ArrayList<>();

        list11.add(88);
        list11.add(71);
        list11.add(99);
        list11.add(69);
        list11.add(98);
        list11.add(59);
        Collections.sort(list11);
        System.out.println(list11);

    }
}
