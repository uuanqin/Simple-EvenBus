package top.uuanqin.simpleEvenbus.evenbus;

import java.util.concurrent.Executor;

/**
 * @author uuanqin
 */
public class AsyncEventBus extends EventBus {
    public AsyncEventBus(Executor executor) {
        super(executor);
    }
}
