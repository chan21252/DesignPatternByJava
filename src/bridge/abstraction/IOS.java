package bridge.abstraction;

import bridge.implementer.OS;

/**
 * iOS手机
 *
 * @author Administrator
 * @since 2020-02-10
 */
public class IOS extends Phone {

    public IOS(OS os) {
        super(os);
        System.out.println("初始化iOS手机");
    }

    @Override
    public void open() {
        os.open();
    }

    @Override
    public void close() {
        os.close();
    }

    @Override
    public void call() {
        os.call();
    }
}
