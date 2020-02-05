package priv.xzhi.headfirst.example_01;

import priv.xzhi.headfirst.example_01.duck.base.Duck;
import priv.xzhi.headfirst.example_01.duck.impl.MallardDuck;
import priv.xzhi.headfirst.example_01.duck.impl.ModelDuck;
import priv.xzhi.headfirst.example_01.service.impl.flybehavior.FlyRocketPowered;

/**
 * Desc: 入口类
 * Created by Xzhi on 2020-02-05 13:14.
 */

public class Main {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
