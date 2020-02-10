package bridge.abstraction;

import bridge.implementer.OS;

/**
 * 抽象的手机类
 *
 * @author Administrator
 * @since 2020-02-10
 */
public abstract class Phone {
    /**
     * 操作系统
     */
    protected OS os;

    public Phone(OS os) {
        this.os = os;
    }

    public abstract void open();

    public abstract void close();

    public abstract void call();
}
