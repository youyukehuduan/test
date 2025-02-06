package org.example;

public class Animal {
    //属性
    String name;

    //构造方法
    public Animal(String name) {
        this.name = name;
    }


    public void Sound(){
        System.out.println(name + " is sounding");
    }

    public void Attr(){System.out.println("这些都是动物");}
}
