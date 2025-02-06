package org.example;

interface Animal{
    void sound();
}

class Dog implements Animal{
    @Override
    public void sound() {
        System.out.println("Dog is barking");
    }
}
class Cat implements Animal{
    @Override
    public void sound() {
        System.out.println("Cat is miao");
    }
}