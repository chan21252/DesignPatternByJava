package builder.house.product;

/**
 * 房子，产品
 *
 * @author Administrator
 * @since 2020-02-08
 */
public class House {
    /**
     * 地基
     */
    private String base;

    /**
     * 墙
     */
    private String wall;

    /**
     * 屋顶
     */
    private String roof;

    public House() {
    }

    public House(String base, String wall, String roof) {
        this.base = base;
        this.wall = wall;
        this.roof = roof;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getRoof() {
        return roof;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    @Override
    public String toString() {
        return "House{" +
                "base='" + base + '\'' +
                ", wall='" + wall + '\'' +
                ", roof='" + roof + '\'' +
                '}';
    }
}
