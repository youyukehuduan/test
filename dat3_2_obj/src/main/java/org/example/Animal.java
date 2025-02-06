package org.example;


//向上转型：
//
//安全：子类对象可以赋值给父类引用，编译器会自动完成转型。
//丢失子类特有的功能：只能访问父类定义的方法和属性。和子类重写方法
//向下转型：
//向下转型  需要调用子类特有方法 狗会跳
//不安全：需要手动转换，且必须确保父类引用实际指向的是目标子类对象，否则会抛出 ClassCastException。
//需要检查：可以使用 instanceof 来确保安全转型。
public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    //抽象方法 ：
    public abstract void eat();

    //具体方法 ：
    public void show_info(){
        System.out.println("This is a animal,Name: " + name);
    }
}
class Dog extends Animal {
    private int age;

    public Dog(String name,int age){
        super(name);
        this.age = age;
    }
    @Override
    public void eat(){
        System.out.println("Dog is eating meets");
    }
}

class Cat extends Animal {
    public Cat(String name){
        super(name);
    }

    @Override
    public void eat(){
        System.out.println("Cat is eating fishs");
    }
    public void job(){
        System.out.println("Cat is a police!,这是我的特有方法");
    }
}