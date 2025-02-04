//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {
        //TIP 当文本光标位于高亮显示的文本处时按 <shortcut actionId="ShowIntentionActions"/>
        // 查看 IntelliJ IDEA 建议如何修正。
//        System.out.println("Hello and welcome!");
//
//        for (int i = 1; i <= 10; i++) {
//            //TIP 按 <shortcut actionId="Debug"/> 开始调试代码。我们已经设置了一个 <icon src="AllIcons.Debugger.Db_set_breakpoint"/> 断点
//            // 但您始终可以通过按 <shortcut actionId="ToggleLineBreakpoint"/> 添加更多断点。
//            System.out.println("i = " + i);
//        }
        int a = 10;
        int b = a;
        a = 30;
        System.out.println(b);//基本数据类型（如int、double、boolean等）的赋值是值传递

        String s1 = "hello";
        String s2 = s1;
        s1 = "world";
        System.out.println(s2);//引用数据类型（如String、数组、对象等）的赋值是引用传递，即将变量的引用（内存地址）复制一份给另一个变量

    }
}