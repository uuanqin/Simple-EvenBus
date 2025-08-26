package top.uuanqin.simpleEvenbus.pattern.observer;

import top.uuanqin.simpleEvenbus.evenbus.Subscribe;

/**
 * @author uuanqin
 */
public class StringObserver {

    @Subscribe
    private void print(String str){
        System.out.println("打印字符串："+str);
    }
}
