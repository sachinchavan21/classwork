package ClassPractice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class set012 {

    public static void main(String[] args) {
        Set course_set = new HashSet();
        course_set.add("ATB");
        course_set.add("MTB");
        course_set.add("Java");
        course_set.add("Jquery");
        course_set.add("CSS");

//        Iterator it5 = course_set.iterator();
//        while (it5.hasNext()) {
//            System.out.println(it5.next());
//        }
        for (Object obj : course_set){
            System.out.println(obj);
        }
    }
}
