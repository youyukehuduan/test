package org.example;

public class myDebug {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i <= 10; i++) {
            sum = add(sum,i);
        }
        System.out.println("1-10的和是:\t" + sum);

//        int sum = 0;
//        sum = add(sum,5);   //步入和步过  步入（Step Into）：进入方法内部，逐步执行
//        System.out.println("result:\t" + sum);

    }

    public static int add(int a,int b){
        return a + b;
    }
}
