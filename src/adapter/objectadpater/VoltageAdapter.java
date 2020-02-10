package adapter.objectadpater;

/**
 * 将220V电压转为5V
 *
 * @author Administrator
 * @since 2020-02-09
 */
public class VoltageAdapter implements Voltage5V {
    /**
     * 组合220V电压
     */
    private Voltage220V voltage220V;

    public VoltageAdapter() {
    }

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    /**
     * 输出5V电压
     *
     * @return int
     */
    @Override
    public int output5V() {
        int srcV = voltage220V.output220V();
        int dstV = srcV - 215;
        System.out.println("输出" + dstV + "V电压");
        return dstV;
    }
}
