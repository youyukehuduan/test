package org.example;

public class test_Shape {
    protected String name;

    public void dot() {
        System.out.println("Shape can have Dots");
    }
}

class Circle extends test_Shape{

    @Override
    public void dot() {
        System.out.println("Circle is not Dot");
    }
}
class Rectangle extends test_Shape{

    @Override
    public void dot() {
        System.out.println("Rectangle is hava  Dots");
    }
    public void show_info(){
        System.out.println("I am a rectangle");
    }
}