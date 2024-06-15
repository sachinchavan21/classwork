package ClassPractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
//import java.util.SequencedCollection;
public class List004 {
    public static <SequencedCollection> void main(String[] args) {
        ArrayList mylist3 = new ArrayList(); // CR - CO
        List mylist = new ArrayList(); //FR -> CO
//        SequencedCollection mylist4 =  new ArrayList(); // GF -> CO
        Collection mylist5 = new ArrayList();
        mylist3.add("sachin");
        mylist.add("bhel");
        mylist5.add("tcs");
        System.out.println(mylist3);
        System.out.println(mylist);
        System.out.println(mylist5);
    }
}
