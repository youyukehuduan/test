public class arr {
    public static void main(String[] args) {

            //引用传递
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = arr1;
        arr2[0] = 10;
        System.out.println(arr1[0]);

//        int[] numbers = new int[5]; // 动态初始化
//        String[] names = new String[5]; // 动态初始化
//
////        int[] num = new int[5];
//        int[] nums = {1,2,3,4,5};
//        int[] nums2 = nums;
//        nums[0] = 100;
//        //System.out.println(nums2[0]);//数组是引用类型，变量存储的是数组对象的引用（内存地址）//无法指针偏移
//        //数组最大数
//        int[] number = {1,3,5,7,9,8,0,4,2,6};
//        int n = 0;
//        for(int num : number){
//            if(n < num){
//                n = num;
//            }
//        }
//        System.out.printf("数组最大的数是%d",n);
      //  num = {1,2,3,4,5}; //错误，静态初始化只能在声明时使用

//        numbers = {1,2,3,4,5};
//        int[] num = {8,7,6,5,4};
//        num[0] = 3;
//        Arrays.sort(num);
//        System.out.println(num[0]);
//        for(int i = 0;i <num.length;i++){
////            System.out.println(num[i]);
////            System.out.printf("第" + i + 1 +"个元素是" + i);
//        }
//        for(int n:num){
//           System.out.println(n);
//        }
//    int[][] arrs = {{1,2,3},{4,5,6},{7,8,9}};
//    System.out.println(arrs[1][2]);
//    for(int i = 0;i < arrs.length;i++){
//        for(int j = 0;j < arrs[i].length;j++){
//            System.out.print(arrs[i][j]+" ");
//        }
//        System.out.println();
//    }

    }
}
