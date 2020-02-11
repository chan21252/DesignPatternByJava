package decorator.competent;

import java.math.BigDecimal;

/**
 * 玛奇朵
 *
 * @author Administrator
 * @since 2020-02-11
 */
public class Macchiato extends Coffe {
    public Macchiato() {
        setName("玛奇朵");
        setPrice(new BigDecimal(25));
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
