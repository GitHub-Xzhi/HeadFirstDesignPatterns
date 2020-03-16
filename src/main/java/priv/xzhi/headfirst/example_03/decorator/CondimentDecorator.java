package priv.xzhi.headfirst.example_03.decorator;

import priv.xzhi.headfirst.example_03.beverages.Beverage;

/**
 * Desc: 调料装饰抽象类
 * Created by Xzhi on 2020-03-16 15:49.
 */
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
