package top.uuanqin.simpleEvenbus.pattern.observer;

import top.uuanqin.simpleEvenbus.evenbus.Subscribe;

/**
 * @author uuanqin
 */
public class IntegerObserver {
    String name;

    public IntegerObserver(String name) {
        this.name = name;
    }

    @Subscribe
    private void mul(Integer i) {
        System.out.println("观察者[" + name + "] " + "计算平方：i*i = " + i * i);
    }

    @Subscribe
    private void print(Integer i) {
        System.out.println("观察者[" + name + "] " + "打印：i = " + i);
    }

}
