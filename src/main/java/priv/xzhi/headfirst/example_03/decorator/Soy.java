package priv.xzhi.headfirst.example_03.decorator;

import priv.xzhi.headfirst.example_03.beverages.Beverage;

/**
 * Desc: 豆浆调料
 * Created by Xzhi on 2020-03-16 15:56.
 */
public class Soy extends CondimentDecorator {
    // 委托（保证类型相同）
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",豆浆";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.15;
    }
}
