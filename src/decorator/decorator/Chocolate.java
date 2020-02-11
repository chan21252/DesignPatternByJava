package decorator.decorator;

import decorator.competent.Drink;

import java.math.BigDecimal;

/**
 * 巧克力
 *
 * @author Administrator
 * @since 2020-02-11
 */
public class Chocolate extends Decorator {
    public Chocolate(Drink drink) {
        super(drink);
        setName("巧克力");
        setPrice(new BigDecimal(5));
    }
}
