package org.example;

public class Electricity extends Car {
        private int capacity;   //容积
    public Electricity(String Brand, String Color, int capacity) {
        super(Brand, Color); // 调用父类构造方法，初始化brand和color
        this.capacity = capacity;// 初始化
    }

    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    //重写displayInfo方法，增加显示capacity
    @Override
    public void displayInfo() {
        System.out.println("Brand: " + super.Brand + ", Color: " + super.Color + ",电量:" + capacity);
    }
}
