package bridge.abstraction;

import bridge.implementer.OS;

/**
 * 安卓手机
 *
 * @author Administrator
 * @since 2020-02-10
 */
public class Android extends Phone {

    public Android(OS os) {
        super(os);
        System.out.println("初始化安卓手机");
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
