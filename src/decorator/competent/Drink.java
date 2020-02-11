package decorator.competent;

import java.math.BigDecimal;

/**
 * 饮品抽象类
 *
 * @author Administrator
 * @since 2020-02-11
 */
public abstract class Drink {
    /**
     * 名称
     */
    private String name;

    /**
     * 价格
     */
    private BigDecimal price;

    public Drink() {
    }

    public Drink(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 计算当前的花费
     *
     * @return BigDecimal
     */
    public abstract BigDecimal cost();

    public String getDescription() {
        return getName() + " = " + cost();
    }
}
