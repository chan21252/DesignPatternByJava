package flyweight;

public class Client {
    public static void main(String[] args) {
        WebSitePool pool = new WebSitePool();
        WebSite webSite1 = pool.getWebSite("新闻");
        WebSite webSite2 = pool.getWebSite("博客");
        WebSite webSite3 = pool.getWebSite("新闻");

        System.out.println(webSite1.hashCode());
        System.out.println(webSite3.hashCode());

        webSite1.run();
        webSite2.run();
        webSite3.run();
    }
}
