package org.example;
import java.util.HashMap;
import java.util.Map;

public class myMap {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        String text = "apple banana orange apple apple banana";

        String[] words = text.split(" ");
        for(String word : words) {
            map.put(word,map.getOrDefault(word,0) + 1);
        }
        //便利map
        for(Map.Entry<String,Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        map.forEach((k,v) -> System.out.println(k + " " + v));
    }
}
