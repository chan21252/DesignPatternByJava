package builder.house.builder;

/**
 * 建造高楼
 *
 * @author Administrator
 */
public class TallBuildingBuilder extends AbstractHouseBuilder {
    @Override
    public void buildBase() {
        System.out.println("高楼打地基");
        house.setBase("高楼的地基");
    }

    @Override
    public void buildWall() {
        System.out.println("高楼砌墙");
        house.setWall("高楼的墙");
    }

    @Override
    public void roofed() {
        System.out.println("高楼盖屋顶");
        house.setRoof("高楼的屋顶");
    }
}
