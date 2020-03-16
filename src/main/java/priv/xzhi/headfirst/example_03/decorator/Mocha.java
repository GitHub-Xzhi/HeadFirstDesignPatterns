package priv.xzhi.headfirst.example_03.decorator;

import priv.xzhi.headfirst.example_03.beverages.Beverage;

/**
 * Desc: 摩卡调料
 * Created by Xzhi on 2020-03-16 15:56.
 */
public class Mocha extends CondimentDecorator {
    // 委托（保证类型相同）
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",摩卡";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.20;
    }
}
