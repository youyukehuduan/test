package org.example;

public class Dog extends Animal{

    public Dog(String name){
        super(name);
    }

    @Override
    public void Sound(){
        System.out.println(name +" is barking");
    }

    // 子类特有方法
    public void Jump(){
        System.out.println("Dog is jumping");
    }
}
