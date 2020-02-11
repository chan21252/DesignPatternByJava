package decorator.decorator;

import decorator.competent.Drink;

import java.math.BigDecimal;

/**
 * 牛奶
 *
 * @author Administrator
 * @since 2020-02-11
 */
public class Milk extends Decorator {
    public Milk(Drink drink) {
        super(drink);
        setName("牛奶");
        setPrice(new BigDecimal(3));
    }
}
