package ClassPractice;

import java.util.*;

public class Collection006 {

    public static void main(String[] args) {
        List<Object> course_list = new ArrayList();
        course_list.add("ATB");
        course_list.add("Salesforce");
        course_list.add("Go-lang");
        course_list.add("Dotnet");
        course_list.add("MTB");
        course_list.add(1);
//        System.out.println(course_list);
//        Iterator it = course_list.iterator();
//        while (it.hasNext()) {
////            it.add("Gen AI");
//            System.out.println(it.next());
//        }

        ListIterator it2 = course_list.listIterator(course_list.size());

            while (it2.hasPrevious())
            {    it2.add("MTB2");
            System.out.println(it2.hasPrevious());        }
    }
}
