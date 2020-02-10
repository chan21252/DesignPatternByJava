package bridge.implementer;

/**
 * 手机操作系统接口
 *
 * @author Administrator
 * @since 2020-02-10
 */
public interface OS {
    /**
     * 开机
     */
    void open();

    /**
     * 关机
     */
    void close();

    /**
     * 打电话
     */
    void call();
}
