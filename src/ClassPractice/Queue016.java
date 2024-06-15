package ClassPractice;

import com.sun.tools.javac.Main;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue016 {

    public static void main(String[] args) {
        Queue q = new PriorityQueue();
        q.add("B");
        q.add("C");
        q.add("E");
        q.add("F");
        q.add("E");
//        System.out.println(q);
//       System.out.println(q.poll());
//        System.out.println(q.peek());
//        System.out.println(q);

        Iterator itc = q.iterator();
        while (itc.hasNext()){
            System.out.print(itc.next()+" ");
        }

    }
}
