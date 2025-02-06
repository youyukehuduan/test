import java.util.Scanner;

public class review {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    // 两数之和 //时间复杂度是O(n^2)
        int[] arr = {3,6,4,8};
        int target = 7;
        int all_index = arr.length - 1;
        for(int i=0;i<=all_index;i++) {
            for(int j = i + 1;j<=all_index;j++) {
                if(arr[i] + arr[j] == target) {
                    System.out.println("有结果了:\t" +"i下标为" + i + "j下标为" + j);
                }
            }
        }


//        System.out.println("请输入商品金额");
//        int all = sc.nextInt();
//
//        System.out.println("请输入支付金额");
//        int pay = sc.nextInt();
//
//        int money = pay - all;
//        if(money >= 0){
//            int n1 = money / 50;
//            money %= 50;
//            int n2 = money / 20;
//            money %= 20;
//            int n3 = money / 10;
//            money %= 10;
//            int n4 = money / 5;
//            money %= 5;
//            int n5 = money;
//            System.out.printf("需要%d张50元，%d张20元，%d张10元，%d张5元，%d张1元",n1,n2,n3,n4,money);
//        }else{
//            System.out.println("金额不足");
//        }


    }


}
