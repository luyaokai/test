package test;

import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("a","a");
        map.put("b","b");
        map.put("c","c");
        Map<String,String> map2 = new HashMap<>();
        map2.put("d","d");
        map2.put("e","g");
        map2.put("f","f");
        map2.putAll(map2);
        map2.containsKey("a");
        System.out.println(map2.get("f"));
        System.out.println("通过Map.keySet遍历key和value：");
        for (String key : map.keySet()) {
            System.out.println("key= "+ key + " and value= " + map.get(key));
        }
        System.out.println(map.get("b"));
        int c=map.size();
        System.out.println(c);
        boolean d=map.containsKey(map2);
        System.out.println(d);
    }

}
