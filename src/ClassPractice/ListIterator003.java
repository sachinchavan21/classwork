package ClassPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIterator003 {
    public static void main(String[] args) {
        List<String> Course_List = new ArrayList();
        Course_List.add("ATB");
        Course_List.add("MTB");
        Course_List.add("Python");
        Course_List.add("Java");
        Course_List.add("Java-Testing");

        System.out.println(Course_List);

        Iterator<String> it = Course_List.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
