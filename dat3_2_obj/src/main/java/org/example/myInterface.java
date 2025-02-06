package org.example;

interface Cars{
    void start();
    void stop();
}

class subway implements Cars{

    @Override
    // 实现接口中的 start 方法
    public void start() {
        System.out.println("subway start");
    }

    @Override
    // 实现接口中的 start 方法
    public void stop() {
        System.out.println("subway stop");
    }

}