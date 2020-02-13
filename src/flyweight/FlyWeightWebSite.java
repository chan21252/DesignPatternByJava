package flyweight;

public class FlyWeightWebSite extends WebSite {
    private String type;

    public FlyWeightWebSite(String type) {
        this.type = type;
    }

    @Override
    public void run() {
        System.out.println(type + "正在运行...");
    }
}
