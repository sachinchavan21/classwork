package ClassPractice;

import java.util.*;

public class Arraylist {
    public static void main(String[] args) {


//    List<Integer> menu_list = new ArrayList<>(Arrays.asList(1,2,3,5));
//        System.out.println(menu_list);


        ArrayList<String> menu_list = new ArrayList<>();
        menu_list.add("Poha");
        menu_list.add("Idli");
        menu_list.add("vada");
        menu_list.add("salad");
        menu_list.add("upma");

        Iterator<String> it = menu_list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());

        }
        System.out.println("New LinkedList");

        ArrayList<String> menu_list3 = new ArrayList<>();
        menu_list.add("Poha1");
        menu_list.add("Idli1");
        menu_list.add("vada");
        menu_list.add("salad");
        menu_list.add("upma");

LinkedList menu_list1 = new LinkedList();
        menu_list1.add("tea");
        menu_list1.add("sabja");
        menu_list1.add("panner chingari");
        menu_list1.add("alo mattar");
        menu_list1.add("kaju masala");

        Iterator<String> it1 = menu_list1.iterator();
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }
//       List<String> mergelist = mergeSortedLists(menu_list,menu_list3);


        }


}
