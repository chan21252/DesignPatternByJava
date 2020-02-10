package bridge.implementer;

/**
 * 华为手机操作实现
 *
 * @author Administrator
 * @since 2020-02-10
 */
public class HuaWei implements OS {
    /**
     * 开机
     */
    @Override
    public void open() {
        System.out.println("华为手机开机");
    }

    /**
     * 关机
     */
    @Override
    public void close() {
        System.out.println("华为手机关机");
    }

    /**
     * 打电话
     */
    @Override
    public void call() {
        System.out.println("华为手机打电话");
    }
}
