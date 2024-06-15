package ClassPractice;

import java.util.Enumeration;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class collection007 {
    public static void main(String[] args) {
        Vector ttcourse = new Vector();
        ttcourse.add("ATB");
        ttcourse.add("MTB");
        ttcourse.add("Jquery");
        ttcourse.add("HTML");
        ttcourse.add("spring Boot");

        Enumeration e = ttcourse.elements();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }



    }
}
