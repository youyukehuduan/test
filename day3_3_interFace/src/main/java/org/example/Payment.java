package org.example;

interface Payment{
    void pay();//支付方法
}

class Alipay implements Payment{
    @Override
    public void pay() {
        System.out.println("Alipay");
    }
}
class Wechat implements Payment{
    @Override
    public void pay() {
       System.out.println("Wechat");
    }
}