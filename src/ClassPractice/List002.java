package ClassPractice;

import java.util.ArrayList;
import java.util.List;

public class List002 {
    public static void main(String[] args) {


        List<Object> mylist = new ArrayList<>();
        mylist.add("pramod");
        mylist.add("sager");
        mylist.add("sunil");
        mylist.add("akshtha");
        mylist.add("sunil");
        mylist.add(123);
//        System.out.println(mylist);
//        System.out.println(mylist.size());

//        for(int i=0;i<mylist.size();i++){
//            System.out.print(mylist.get(i));
//            System.out.print(" ");
//        }
        for(Object obj1 : mylist)
            System.out.println(obj1);
//
//        System.out.println();
//        mylist.remove("sager");
//        System.out.println(mylist);
//        mylist.clear();
//        System.out.println(mylist);
//        System.out.println(mylist.isEmpty());

        List<Integer> mylist1 = new ArrayList<>();
        mylist1.add(123);
        mylist1.add(568);
        mylist1.add(59);
        System.out.println(mylist1);
    }
}
