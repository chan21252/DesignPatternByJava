package command.receiver;

/**
 * @author Administrator
 */

public enum SoftWare {
    /**
     * nginx
     */
    NGINX("nginx"), MYSQL("mysql");

    private String id;

    SoftWare(String id) {
        this.id = id;
    }

    public void start() {
        System.out.println("启动" + id);
    }

    public void stop() {
        System.out.println("关闭" + id);
    }

}
