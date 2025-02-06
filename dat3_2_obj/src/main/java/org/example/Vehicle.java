package org.example;

public abstract class Vehicle {
    //抽象方法 ： 计算车速度
    public abstract void speed();

    //具体方法 ： 打印车辆信息
    public void show_info(){
        System.out.println("这是一个交通工具");
    }
}
class Car extends Vehicle {
    private int tyre;
    public Car(int tyre) {
        this.tyre = tyre;
    }

    @Override
    public void speed() {
        System.out.println("车辆跑得快");
    }
}

class bike extends Vehicle {
    private int cost;
    public bike(int cost) {
        this.cost = cost;
    }

    @Override
    public void speed() {
        System.out.println("车辆跑得慢");
    }
}
