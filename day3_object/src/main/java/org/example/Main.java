package org.example;    //包名 org.example 是逻辑上的结构，文件夹路径 org/example/ 是物理上的结构

//本质是处理 父类与子类之间的类型转换
public class Main {
    public static void main(String[] args) {
        //animal
        Animal animal = new Animal("Jack");
        animal.Sound();
        Dog dog = new Dog("Rose");
        dog.Sound();


        // 向上转型：父类引用指向子类对象
        Animal animal2 = new Dog("Mike");
        animal2.Sound();    // 调用重写后的方法
        //animal2.jump();// 错误！父类引用无法调用子类特有方法
        //向下转型  需要调用子类特有方法 狗会跳
        if(animal2 instanceof Dog){
            Dog dog2 = (Dog) animal2;
            dog2.Jump();
        }

            //test
//        test_Shape shape = new Circle();
//        shape.dot();
//        test_Shape shape2 = new Rectangle();
//        shape2.dot();
//        if(shape2 instanceof Rectangle){
//            Rectangle Rectangle = (Rectangle) shape2;
//            Rectangle.show_info();
//        }

        //car
//        Car c1 = new Car("奔驰","绿色");
//
//        c1.setBrand("宝马");
//        c1.displayInfo();
//        Electricity e1 = new Electricity("蔚来","白色",50);
//        e1.displayInfo();
    }
}