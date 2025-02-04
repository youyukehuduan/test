package org.example;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        for(String s : list){
            System.out.println(s);
        }
        // 遍历方式2：forEach + Lambda
        list.forEach(s-> System.out.println(s));
    }
}