package proxy.staticproxy;

public class Client {
    public static void main(String[] args) {
        ITeacher target = new Target();
        ITeacher proxy = new Proxy(target);
        proxy.teach();
    }
}
