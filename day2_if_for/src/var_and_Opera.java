public class var_and_Opera {    //变量和运算符
    public static void main(String[] args) {
//        int a = 123456789;
//        float b = a;
//        System.out.println(b); //丢失部分精度
//        int x  = 10;
//        x += 3.5;
//        System.out.println(x); // 13

//        int n = 10;
//        int m = 10;
//        System.out.println(2 * ++n);    //22    建议不要在表达式中使用++
//        System.out.println(2 * m++);    //20

        //闰年
//        int year = 2100;
////        boolean isLeap = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
//        boolean isLeap = year % 400 == 0 || year % 4 == 0 && year % 100 != 0 ;//&& (与运算符) 的优先级 高于 || (或运算符)
//        System.out.printf("%d年%s闰年",year,isLeap ? "是" : "不是");

        int a = 10;
        int b = 20;
        int c = 30;
        a +=b += c;
        System.out.println(a);  //60 为+=是右结合运算符 等价 a+=(b+=c)


    }
}
