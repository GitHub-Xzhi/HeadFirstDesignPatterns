package priv.xzhi.headfirst.example_01.duck.impl;

import priv.xzhi.headfirst.example_01.duck.base.Duck;
import priv.xzhi.headfirst.example_01.service.impl.flybehavior.FlyWithwings;
import priv.xzhi.headfirst.example_01.service.impl.quackbehavior.Quack;

/**
 * Desc: 绿头鸭
 * Created by Xzhi on 2020-02-05 13:07.
 */

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithwings();
    }

    @Override
    public void display() {
        System.out.println("我是绿头鸭");
    }
}
