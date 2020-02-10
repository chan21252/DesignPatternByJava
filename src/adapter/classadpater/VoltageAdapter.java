package adapter.classadpater;

/**
 * 将220V电压转为5V
 *
 * @author Administrator
 * @since 2020-02-09
 */
public class VoltageAdapter extends Voltage220V implements Voltage5V {
    /**
     * 输出5V电压
     *
     * @return int
     */
    @Override
    public int output5V() {
        int srcV = output220V();
        int dstV = srcV - 215;
        System.out.println("输出" + dstV + "V电压");
        return dstV;
    }
}
