package decorator.competent;

import java.math.BigDecimal;

/**
 * 拿铁
 *
 * @author Administrator
 * @since 2020-02-11
 */
public class Latte extends Coffe {
    public Latte() {
        setName("拿铁");
        setPrice(new BigDecimal(30));
    }

    /**
     * 计算当前的花费
     *
     * @return BigDecimal
     */
    @Override
    public BigDecimal cost() {
        return getPrice();
    }
}
