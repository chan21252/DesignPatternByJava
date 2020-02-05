package singleton.enums;

/**
 * 枚举：红绿灯
 *
 * @author Administrator
 */
public enum TrafficLight {
    //红绿灯
    RED("红", 30),
    YELLOW("黄", 3),
    GREEN("绿", 20);

    /**
     * 颜色
     */
    private String color;

    /**
     * 秒数
     */
    private int seconds;

    TrafficLight(String color, int seconds) {
        this.color = color;
        this.seconds = seconds;
    }

    public void show() {
        System.out.println("颜色： " + color + "，秒数： " + seconds);
    }
}
