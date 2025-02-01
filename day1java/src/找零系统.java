import java.util.Scanner;
public class 找零系统 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("请输入商品总价");
        int all = sc.nextInt();

        System.out.printf("请输入支付的金额");
        int pay_all = sc.nextInt();

        //找零金额
        int money = pay_all - all;

        if (money >= 0) {
            int num50 = money / 50;
                 money %= 50;
            int num20 = money / 20;
                 money %= 20;
            int num10 = money / 10;
                 money %= 10;
            int num5 = money / 5;
                 money %= 5;
            int num1 = money;
            System.out.printf("需要%d张50元,%d张20元，%d张10元，%d张5元，%d张1元", num50, num20, num10, num5, num1);
        } else {
            System.out.println("金额不足");
        }
    }
}
