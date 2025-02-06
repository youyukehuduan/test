package org.example;
//抽象类 用来为子类提供模板，强制子类实现某些方法，并且可以有实现的方法、成员变量和构造方法。
//抽象方法 强制子类必须实现，而普通方法可以直接继承或重写。
//抽象类不能实例化，必须通过子类来创建对象。
public class Main {
    public static void main(String[] args) {
        //interface  接口
        Cars c1 = new subway();
        c1.start();
        c1.stop();

            //car
//            Car c1 = new Car(4);
//            c1.speed();
//            c1.show_info();
//
//            bike b1 = new bike(2000);
//            b1.speed();
//            b1.show_info();

            // Animal
//        Animal a1 = new Dog("Chen",15);
//        a1.eat();
//        a1.show_info();
//
//        Animal a2 = new Cat("Zhou");
//        a2.eat();
////        a2.job(); //无法访问子类特有的功能
//        a2.show_info();
//
//        if(a2 instanceof Cat){
//            Cat cat = (Cat)a2;
//            cat.job();
//            cat.show_info();
//        }
    }
}
