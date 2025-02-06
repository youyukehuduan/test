public class myString {
    public static void main(String[] args) {

        String s1 = "hello";
        String s2 = "world";


        //字符串相等
       String s3 = new String("hello");
       String s5 = "hello";
       System.out.println(s1 == s3);// false, s1和s2不是同一个对象
       System.out.println(s1 == s5);// true，字符串常量池中相同的字符串字面量会共享相同的内存地址（引用），所以相同字面量的字符串比较是true。
//        System.out.println(s1.equals(s3));

//        String str = "";
//        String str2;    //str2 等于null，编译器会报错
//        System.out.println(str == null );


        StringBuilder s4 = new StringBuilder();
        s4.append(s1);
        System.out.println(s4);
        s4.append(s2);
        System.out.println(s4);

//        System.out.println(str2 == null );

//        int num = s1.indexOf("l");
//        System.out.println(num);
            //字符串不可变  指的是字符串内容不可修改，引用可以改，一种特殊的常量指针。s1 = "oslo"; 这是更改引用！
        //你不能改变字符串对象内部的数据（就像你不能修改常量指针所指向的值）。
        //但是，你可以改变字符串对象的引用（指针），就像你可以将常量指针指向不同的常量。
//        System.out.println(s1[0]);
//         s1 = "oslo";
//         s1 += " Oslo!";
//         System.out.println(s1);
        // 下面这行代码会报错，因为 str 的值是不可变的
        // s1[0] = 'H'; // 编译错误: str不能被直接修改


//        String rst = s1 + " " + s2;
//        System.out.println(rst);
//        String substr = rst.substring(6,11);
//        System.out.println(substr);
//
//        String rst2 = rst.replace("world","Oslo");
//        System.out.println(rst2);
//        System.out.println(rst2.length());
//
//        String[] strArray = rst2.split(" ");
//        for(String s : strArray){
//            System.out.println(s);
//        }
//        //字符串反转 StringBuilder类属于java.lang包 默认包不需要导入
//        String rst3 = new StringBuilder(rst2).reverse().toString();
//        System.out.println(rst3);

        // join
//        String newS = String.join("/","hello","world");
//        System.out.println(newS);


    }
}
