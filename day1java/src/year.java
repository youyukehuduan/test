import java.util.Scanner;
public class year{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入要判断的年份: ");
        int year = sc.nextInt();

//        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
//            System.out.print("这是闰年");
//        }else{
//            System.out.print("这是平年");
//        }
        boolean isLeap = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        System.out.printf("%d年%s闰年",year,isLeap ? "是" : "不是");
    }
}
