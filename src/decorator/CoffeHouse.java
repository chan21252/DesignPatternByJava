package decorator;

import decorator.competent.Americano;
import decorator.competent.Drink;
import decorator.decorator.Chocolate;
import decorator.decorator.Milk;

public class CoffeHouse {
    public static void main(String[] args) {
        //点一杯美式，加2份巧克力，加1份牛奶，价格是35+10+3 = 48
        Drink americano = new Americano();
        System.out.println(americano.getDescription());

        Drink chocolate = new Chocolate(americano);
        System.out.println(chocolate.getDescription());

        Drink chocolate2 = new Chocolate(chocolate);
        System.out.println(chocolate2.getDescription());

        Drink milk = new Milk(chocolate2);
        System.out.println(milk.getDescription());

        System.out.println("总花费是 " + milk.cost());
    }
}
