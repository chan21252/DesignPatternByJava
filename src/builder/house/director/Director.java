package builder.house.director;

import builder.house.builder.AbstractHouseBuilder;
import builder.house.product.House;

/**
 * 指挥者，指挥建造者如何构建房子
 *
 * @author Administrator
 */
public class Director {
    private AbstractHouseBuilder builder;

    public Director() {
    }

    public Director(AbstractHouseBuilder builder) {
        this.builder = builder;
    }

    public AbstractHouseBuilder getBuilder() {
        return builder;
    }

    public void setBuilder(AbstractHouseBuilder builder) {
        this.builder = builder;
    }

    /**
     * 构建房子
     *
     * @return House
     */
    public House buildHouse() {
        builder.buildBase();
        builder.buildWall();
        builder.roofed();
        return builder.buildHouse();
    }
}
