package adapter.classadpater;

/**
 * 手机类
 *
 * @author Administrator
 * @since 2020-02-09
 */
public class Phone {
    /**
     * 充电
     *
     * @param power Voltage5V 5V电压
     * @return boolean
     */
    public boolean charge(Voltage5V power) {
        int voltage = power.output5V();
        if (voltage == 5) {
            System.out.println("正在充电");
            return true;
        } else {
            System.out.println("电源不适配，无法充电");
            return false;
        }
    }
}
