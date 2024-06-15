package ClassPractice;

import java.util.Collections;
import java.util.Vector;

public class collection009 {


    public static void main(String[] args) {
        Vector v = new Vector();
        v.add(59);
        v.add(99);
        v.add(87);
        v.add(69);
        Collections.sort(v);
        System.out.println(v);
    }
}
