package HashMaps;

import java.util.HashMap;
import java.util.Set;

public class MApUse {
    public static void main(String[] args) {
        HashMap<String, Integer> map= new HashMap<>();
        map.put("abc", 1);
        map.put("def", 2);
        map.put("abc1", 1);
        map.put("def1", 2);
        map.put("abc2", 1);
        map.put("def2", 2);

        System.out.println("Size: " + map.size());
        if(map.containsKey("abc")){
            System.out.println("has abc key");
        }else{
            System.out.println("don't have");
        }
        int v=0;
        if(map.containsKey("abc1")){
            v=map.get("abc1");
        }
        if(map.containsValue(2)){
            System.out.println("has 2 value");
        }
        System.out.println(v);

        System.out.println("Size: " + map.size());
        Set<String > keys= map.keySet();
        for(String str: keys){
            System.out.print(str + " ");
        }
        System.out.println();
    }
}
