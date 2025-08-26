package top.uuanqin.simpleEvenbus.evenbus;

import top.uuanqin.simpleEvenbus.evenbus.utils.DirectExecutor;

import java.util.List;
import java.util.concurrent.Executor;

/**
 * @author uuanqin
 */
public class EventBus {
    private Executor executor;
    private ObserverRegistry registry = new ObserverRegistry();

    public EventBus() {
        this(DirectExecutor.directExecutor()); // 默认实现为不开线程
    }

    protected EventBus(Executor executor) {
        this.executor = executor;
    }

    public void register(Object object) {
        registry.register(object);
    }

    public void post(Object event) {
        List<ObserverAction> observerActions = registry.getMatchedObserverActions(event);
        for (ObserverAction observerAction : observerActions) {
            executor.execute(() -> observerAction.execute(event));
        }
    }
}
