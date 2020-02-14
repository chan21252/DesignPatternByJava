package proxy.staticproxy;

public class Proxy implements ITeacher {
    private ITeacher target;

    public Proxy(ITeacher target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("开始静态代理...");
        target.teach();
        System.out.println("结束静态代理...");
    }
}
