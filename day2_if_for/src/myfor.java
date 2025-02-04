import java.util.Scanner;
public class myfor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rst = (int)(Math.random() * 101);
        //System.out.println(num);


        for(int i = 1; i <= 10; i++){
            if(i == 5){
                break;
            }
            System.out.println(i);
        }
        for(int i = 1; i <= 10; i++){
            if(i == 5){
                continue;//跳过这次后面的代码
            }
            System.out.println(i);
        }


//        boolean isCheacked = false;
//        do {
//            System.out.println("请输入你猜测的值 ");
//            int num = sc.nextInt();
//            if (num > rst) {
//                System.out.println("你猜测的值偏大 ");
//            } else if (num < rst) {
//                System.out.println("你猜测的值偏小 ");
//            } else {
//                System.out.println("恭喜你猜对了 ");
//                isCheacked = true;
//            }
//        }
//            while(!isCheacked);



    }
}
