public class myBlock {
    public static void main(String[] args) {
        int a = 10;
        {
            a = 20;
             System.out.println(a);
             int b = 30;
        }
    //    System.out.println(b); 此处b不能访问作用域外
        int i = 0;
        for( i = 0;i < 10;i++){
            System.out.println(i);
        }
        for( i = 0;i < 10;i++){
            System.out.println(i);
        }
    }
}


