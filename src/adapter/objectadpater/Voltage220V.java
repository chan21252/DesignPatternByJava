package adapter.objectadpater;

/**
 * 220V电压
 *
 * @author Administrator
 * @since 2020-02-09
 */
public class Voltage220V {
    private final static int VOLTS = 220;

    public int output220V() {
        System.out.println("输出" + VOLTS + "V电压");
        return VOLTS;
    }
}
