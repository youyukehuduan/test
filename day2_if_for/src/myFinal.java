public class myFinal {
    public static final Double pi = 3.14;   //类常量 static 表示这个常量属于类，通过类名直接访问
    public static void main(String[] args) {

        final int MAX = 100; // 局部常量
        System.out.println(MAX);
        System.out.println(myFinal.pi);

        System.out.println(Math.PI);



    }
}
