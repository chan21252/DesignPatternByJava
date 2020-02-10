package bridge.implementer;

/**
 * 小米手机操作实现
 *
 * @author Administrator
 * @since 2020-02-10
 */
public class XiaoMi implements OS {
    /**
     * 开机
     */
    @Override
    public void open() {
        System.out.println("小米手机开机");
    }

    /**
     * 关机
     */
    @Override
    public void close() {
        System.out.println("小米手机关机");
    }

    /**
     * 打电话
     */
    @Override
    public void call() {
        System.out.println("小米手机打电话");
    }
}
