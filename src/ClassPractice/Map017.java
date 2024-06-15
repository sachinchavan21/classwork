package ClassPractice;

import java.util.HashMap;
import java.util.Map;

public class Map017 {

    public static void main(String[] args) {
        Map<String, Object> mp = new HashMap();
        mp.put("Sachin",89);
        mp.put("Shailesh",69);
        mp.put("Amit",98);
        mp.put("Ankur",76);
        mp.put("tom",88);
        mp.put("Ismale",true);
        mp.put("Course","ATB");
        System.out.println(mp);
        System.out.println(mp.get("Sachin"));
        System.out.println(mp.get("Ismale"));
        System.out.println(mp.containsKey("Ankur"));
        System.out.println(mp.containsValue(76));
        System.out.println(mp.keySet());
        System.out.println(mp.values());

        for (Map.Entry<String,Object> item1 : mp.entrySet()){
            System.out.println(item1.getKey()+":"+item1.getValue());
        }
    }
}
