package proxy.dynamic;

public class Client {
    public static void main(String[] args) {
        ITeacher target = new Target();
        ProxyFactory proxyFactory = new ProxyFactory(target);
        ITeacher proxy = (ITeacher) proxyFactory.getProxyInstance();
        proxy.teach();
    }
}