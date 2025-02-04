package org.example;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;


public class Map1 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("A",1);
        map.put("B",2);
        map.put("C",3);
      //  System.out.println(map); //{A=1, B=2, C=3}
        int num1 = map.get("A");
//        System.out.println(num1);
        boolean num2 = map.containsKey("C");
//        System.out.println(num2);
//        System.out.println(map.size());
        Set<String> keys = map.keySet();  // 返回所有键的集合
        System.out.println(keys);
        for(String key : map.keySet()) {
            System.out.println(key+":"+map.get(key));
        }
        map.forEach((k,v) -> System.out.println(k+":"+v));
    }
}
