package test;

import java.util.ArrayList;
import java.util.List;

public class list {
    public static void main(String[] args) {
        List<String> list =new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        List<String> list1=new ArrayList<>();
        list1.add("d");
        list1.add("e");
        list1.add("f");
        list.addAll(list1);
        boolean a =list.contains("c");
        System.out.println(a);
        boolean b=list.containsAll(list1);
        System.out.println(a);
        list.remove("a");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
