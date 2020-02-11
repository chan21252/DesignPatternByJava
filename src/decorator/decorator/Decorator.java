package decorator.decorator;

import decorator.competent.Drink;

import java.math.BigDecimal;

/**
 * 装饰者抽象类：调味品
 *
 * @author Administrator
 * @since 2020-02-11
 */
public class Decorator extends Drink {
    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    /**
     * 计算当前的花费
     *
     * @return BigDecimal
     */
    @Override
    public BigDecimal cost() {
        return getPrice().add(drink.cost());
    }


    @Override
    public String getDescription() {
        return "加" + getName() + " = " + getPrice() + " && " + drink.getDescription();

    }
}
