package priv.xzhi.headfirst.example_01.duck.impl;

import priv.xzhi.headfirst.example_01.duck.base.Duck;
import priv.xzhi.headfirst.example_01.service.impl.flybehavior.FlyNoWay;
import priv.xzhi.headfirst.example_01.service.impl.quackbehavior.Quack;

/**
 * Desc:
 * Created by Xzhi on 2020-02-05 13:47.
 */

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("我是一只模型鸭");
    }
}
