import java.util.Scanner;//其他类需要显式地导入

public class test{
    public static void main(String[] args){
   //题目1：变量与运算符
    Scanner sc = new Scanner(System.in);
    //用户输入第一个词
        System.out.print("输入第一个数字是");
        int num1 = sc.nextInt();

        //用户输入第二个词
        System.out.print("输入第二个数字是");
        int num2 = sc.nextInt();

//        double sum = num1 + num2;
//        System.out.println("这两个数字之和是" + sum);

        System.out.printf("两数之和为:%d" , num1 +num2);//格式化符号 %d
        System.out.printf("两数之差为:%d" , num1 - num2);
        System.out.printf("两数之积为:%d" , num1 *num2);
        System.out.printf("两数之商为:%.2f" , (double)num1 /num2);

        sc.close();

    }
}