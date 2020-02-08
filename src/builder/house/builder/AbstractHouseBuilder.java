package builder.house.builder;

import builder.house.product.House;

/**
 * 建造者基类，组合一个产品对象
 *
 * @author Administrator
 * @since 2020-02-08
 */
public abstract class AbstractHouseBuilder {
    protected House house = new House();

    /**
     * 打地基
     */
    public abstract void buildBase();

    /**
     * 砌墙
     */
    public abstract void buildWall();

    /**
     * 盖顶
     */
    public abstract void roofed();

    public House buildHouse() {
        return house;
    }
}
