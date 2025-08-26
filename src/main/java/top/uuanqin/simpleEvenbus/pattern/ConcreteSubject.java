package top.uuanqin.simpleEvenbus.pattern;

import top.uuanqin.simpleEvenbus.evenbus.AsyncEventBus;
import top.uuanqin.simpleEvenbus.evenbus.EventBus;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;

/**
 * @author uuanqin
 */
public class ConcreteSubject implements Subject {
    private List<Object> observers = new ArrayList<Object>();
    private EventBus eventBus;


    public ConcreteSubject() {
        // 同步阻塞模式
        eventBus = new EventBus();
        // 异步非阻塞模式
        // eventBus = new AsyncEventBus(Executors.newFixedThreadPool(DEFAULT_EVENTBUS_THREAD_POOL_SIZE));
    }

    @Override
    public void registerObserver(Object observer) {
        eventBus.register(observer);
    }

    @Override
    public void removeObserver(Object observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Object message) {
        eventBus.post(message);
    }
}