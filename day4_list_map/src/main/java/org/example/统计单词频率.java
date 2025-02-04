package org.example;
import java.util.Map;
import java.util.HashMap;

public class 统计单词频率 {
    public static void main(String[] args) {
        String str = "hello world hello olso hello lima";
        String[] arr = str.split(" ");

        Map<String,Integer> map = new HashMap<>();
        for(String s : arr){
            //如果单词已经在 Map 中，返回其当前的计数，否则返回默认值 0。然后将计数加 1，更新 Map 中的值
            map.put(s,map.getOrDefault(s,0)+1);
        }
        System.out.println(map);

//        for(String s : map.keySet()){   //返回所有key的集合
//            System.out.println(s + " " + map.get(s));
//        }
        map.forEach((k,v)->System.out.println(k+" "+v));
    }
}
