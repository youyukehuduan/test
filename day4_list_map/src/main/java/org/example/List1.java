package org.example;
import java.util.List;
import java.util.ArrayList;

public class List1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        list.add(4,"E");    //不写默认最后
//        System.out.println(list.size());//5
//        System.out.println(list);//[A,B,C,D,E]
        for(String str : list){
            System.out.println(str);
        }
        list.forEach(str -> System.out.println(str));

    }
}
