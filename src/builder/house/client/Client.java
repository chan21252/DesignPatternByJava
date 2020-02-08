package builder.house.client;

import builder.house.builder.AbstractHouseBuilder;
import builder.house.builder.CommonHouseBuilder;
import builder.house.builder.TallBuildingBuilder;
import builder.house.director.Director;
import builder.house.product.House;

/**
 * 客户，让指挥者建造一个产品
 *
 * @author Administrator
 */
public class Client {
    public static void main(String[] args) {
        AbstractHouseBuilder commonHouseBuilder = new CommonHouseBuilder();
        AbstractHouseBuilder tallBuildingBuilder = new TallBuildingBuilder();
        Director director = new Director(commonHouseBuilder);
        House commHouse = director.buildHouse();

        director.setBuilder(tallBuildingBuilder);
        House tallBuilding = director.buildHouse();

        System.out.println(commHouse);
        System.out.println(tallBuilding);
    }
}
