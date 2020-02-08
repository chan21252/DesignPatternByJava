package builder.house.builder;

/**
 * 建造普通房子
 *
 * @author Administrator
 */
public class CommonHouseBuilder extends AbstractHouseBuilder {
    @Override
    public void buildBase() {
        System.out.println("普通房子打地基");
        house.setBase("普通房子的地基");
    }

    @Override
    public void buildWall() {
        System.out.println("普通房子砌墙");
        house.setWall("普通房子的墙");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子盖屋顶");
        house.setRoof("普通房子的屋顶");
    }
}
