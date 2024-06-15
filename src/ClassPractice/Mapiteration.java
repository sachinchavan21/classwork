package ClassPractice;

import java.util.HashMap;
import java.util.Map;

public class Mapiteration {

    public static void main(String[] args) {
        Map<String, Object> mi = new HashMap();
        mi.put("Name","Sachin");
        mi.put("Middle Name","showik");
        mi.put("ID",123);
        mi.put("Ismale",true);
        mi.put("Pin",415301);
        mi.put("Surname","Patil");

   for (Map.Entry<String,Object> kl : mi.entrySet())
        System.out.println(kl.getKey()+" "+kl.getValue());

        }
    }

