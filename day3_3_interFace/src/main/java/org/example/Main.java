package org.example;

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Dog();  //不可以实例化,同抽象类
        a1.sound();
        Animal a2 = new Cat();
        a2.sound();

        Payment ali = new Alipay();
        ali.pay();
        Payment wc = new Wechat();
        wc.pay();
    }
}

