package priv.xzhi.headfirst.example_03.decorator;

import priv.xzhi.headfirst.example_03.beverages.Beverage;

/**
 * Desc: 奶油调料
 * Created by Xzhi on 2020-03-16 15:56.
 */
public class Whip extends CondimentDecorator {
    // 委托（保证类型相同）
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",奶油";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }
}
