package org.example;
import java.util.*;

public class review {
    public static void main(String[] args) {
        //两个数目之和
        int[] arr = {3,4,6,8};
        int target = 10;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i< arr.length;i++){
            int rst = target - arr[i];  // 计算补数
            if(map.containsKey(rst)){   // 查找补数是否已在哈希表中
                System.out.println("找到了符合条件的数：补数 " + rst + " 和当前数 " + arr[i]);
                return;
            }
            map.put(arr[i],i); // 将当前元素及其下标放入哈希表
        }
        System.out.println(map);
        // 3 0
        // 4 1
         //6 2
         //8 3

//        Map<String,Integer> map = new HashMap();
//        map.put("A", 1);
//        map.put("X", 3);
//        map.put("T", 5);
//        System.out.println(map);
//        int a = map.get("A");
//        System.out.println(a);
//
//        Set<String> str = map.keySet();
//        System.out.println(str);
        //第一种便利
//        for(String s : str){
//            System.out.println(s + "" + map.get(s));
//        }
        //第二种遍历
//        map.forEach((k,v)->{System.out.println(k+":"+v);});
//
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.forEach(i->{System.out.println(i);});
    }
}
