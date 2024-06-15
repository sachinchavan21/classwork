package ClassPractice;

import java.util.List;

public class List0001 {

    public static void main(String[] args){
//        List<String> shoping_List = List.of("milk","suger","oil","cheese");
//
//        System.out.println(shoping_List);
//        System.out.println(shoping_List.size());
//        ArrayList mylist = new ArrayList();
//Duplicate can be allowed in List
        List<String> fruites = List.of("orange", "apple","apple", "banana", "apple", "watermelon");
        System.out.println(fruites);
        System.out.println(fruites.get(5));
        System.out.println(fruites.indexOf("apple"));
        System.out.println(fruites.size());

//        List<Integer> My10th_Marks = List.of(89,96,67,54,67);
//        System.out.println(My10th_Marks);
//        System.out.println(My10th_Marks.size());
    }
}
