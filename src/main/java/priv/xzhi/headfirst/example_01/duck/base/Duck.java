package priv.xzhi.headfirst.example_01.duck.base;

import priv.xzhi.headfirst.example_01.service.FlyBehavior;
import priv.xzhi.headfirst.example_01.service.QuackBehavior;

/**
 * Desc: 鸭子超类
 * Created by Xzhi on 2020-02-05 12:48.
 */

public abstract class Duck {

    protected FlyBehavior flyBehavior;

    protected QuackBehavior quackBehavior;

    public abstract void display();

    public void swim() {
        System.out.println("我会游泳");
    }

    public void performFly() {
        flyBehavior.fly();
    }
    public void performQuack() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
