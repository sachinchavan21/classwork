package ClassPractice;

import java.util.Set;
import java.util.TreeSet;

public class UniqueSet {

    public static void main(String[] args) {

        int [] arr = {5,4,3,2,1,1,9,5,6};
        System.out.println(arr.length);
        Set uniqueset = new TreeSet();
for (Object num : arr){
    uniqueset.add(num);
}
        System.out.println(uniqueset);
        System.out.println(uniqueset.size());
    }
}
