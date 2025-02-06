package org.example;

//注意 try(){}catch(){} 是try{}catch(){}的语法糖，多了自动关闭资源等功能，如数据库连接，后者需要手动增加finally()关闭。

public class myException {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try{
            int rst = a / b;
            System.out.println(rst);
        }catch(Exception e){
            System.out.println(e + "\t错误，不能除以0");
            System.out.println(e.getMessage()); //获取异常的简要描述。
        }finally {
            System.out.println("运算结束");
        }
//        int[] arr = new int[10];
//        try {
//            System.out.println(arr[10]);
//        }
//        catch (Exception e){
//            System.out.println(e +"\t下标访问异常");
//            System.out.println(e.getMessage());
//        }



    }
}
