package proxy.cglib;

public class Client {
    public static void main(String[] args) {
        Target target = new Target();
        ProxyFactory proxyFactory = new ProxyFactory(target);
        Target proxy = (Target) proxyFactory.getProxyInstance();
        proxy.teach();
    }
}
