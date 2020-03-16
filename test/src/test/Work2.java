package test;

import java.util.HashMap;
import java.util.Map;

public class Work2 {
    public static void main(String[] args) {
        Map<String, Work1.Student> map1 = new HashMap<>();
        map1.put("1",(new Work1.Student("张三",18,80,1)));
        map1.put("2",(new Work1.Student("李四",19,100,1)));
        map1.put("3",(new Work1.Student("王五",17,59,1)));
        Map<String, Work1.Student> map2 = new HashMap<>();
        map2.put("4",(new Work1.Student("赵六",18,85,2)));
        map2.put("5",(new Work1.Student("刘七",19,93,2)));
        map2.put("6",(new Work1.Student("孙八",17,55,2)));
        map1.putAll(map2);
        for (String key : map1.keySet()) {
            if(map1.get(key).getNumber()<60) {
                System.out.println((map1.get(key).getName()+" "+map1.get(key).getAge()+
                        "岁 "+map1.get(key).getNumber()+ "分 "+map1.get(key).getCla()+"班"));
            }
        }
        System.out.println("===========================");
        for (String key : map1.keySet()) {
            if(map1.get(key).getName()=="张三") {
                System.out.println((map1.get(key).getName()+" "+map1.get(key).getAge()+
                        "岁 "+map1.get(key).getNumber()+ "分 "+map1.get(key).getCla()+"班"));
            }
        }
        System.out.println("=====================");
        Map<String, Work1.Student> map3 = new HashMap<>();
        for (String key : map1.keySet()) {
            if(map1.get(key).getAge()<=18) {
                map3.put("key",(new Work1.Student(map1.get(key).getName(),map1.get(key).getAge(),
                        map1.get(key).getNumber(),map1.get(key).getCla())));
            }
        }
        for (String key : map3.keySet()) {
                System.out.println((map3.get(key).getName()+" "+map3.get(key).getAge()+
                        "岁 "+map3.get(key).getNumber()+ "分 "+map3.get(key).getCla()+"班"));
        }
    }
}
