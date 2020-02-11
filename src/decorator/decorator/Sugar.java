package decorator.decorator;

import decorator.competent.Drink;

import java.math.BigDecimal;

/**
 * 糖
 *
 * @author Administrator
 * @since 2020-02-11
 */
public class Sugar extends Decorator {
    public Sugar(Drink drink) {
        super(drink);
        setName("糖");
        setPrice(new BigDecimal(1));
    }
}
