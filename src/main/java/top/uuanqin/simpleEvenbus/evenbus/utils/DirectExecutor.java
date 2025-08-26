package top.uuanqin.simpleEvenbus.evenbus.utils;

import java.util.concurrent.Executor;

public class DirectExecutor implements Executor {
    @Override
    public void execute(Runnable command) {
        command.run(); // 不开新线程，直接运行
    }

    // 提供一个静态实例方便复用
    public static Executor directExecutor() {
        return new DirectExecutor();
    }
}
