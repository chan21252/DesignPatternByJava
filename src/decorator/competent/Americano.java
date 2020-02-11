package decorator.competent;

import java.math.BigDecimal;

/**
 * 美式咖啡
 *
 * @author Administrator
 * @since 2020-02-11
 */
public class Americano extends Coffe {

    public Americano() {
        setName("美式咖啡");
        setPrice(new BigDecimal(35));
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
