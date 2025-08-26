package top.uuanqin.simpleEvenbus.pattern;

import top.uuanqin.simpleEvenbus.evenbus.EventBus;
import top.uuanqin.simpleEvenbus.pattern.observer.IntegerObserver;
import top.uuanqin.simpleEvenbus.pattern.observer.StringObserver;

/**
 * @author uuanqin
 */
public class Main {

    public static void main(String[] args) {

        ConcreteSubject concreteSubject = new ConcreteSubject();
        concreteSubject.registerObserver(new IntegerObserver("A"));
        concreteSubject.registerObserver(new IntegerObserver("B"));
        concreteSubject.registerObserver(new StringObserver());

        concreteSubject.notifyObservers(12);
        concreteSubject.notifyObservers("message");

    }
}
