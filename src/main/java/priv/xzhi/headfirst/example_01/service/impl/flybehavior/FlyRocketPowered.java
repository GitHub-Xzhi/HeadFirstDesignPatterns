package priv.xzhi.headfirst.example_01.service.impl.flybehavior;

import priv.xzhi.headfirst.example_01.service.FlyBehavior;

/**
 * Desc:
 * Created by Xzhi on 2020-02-05 13:51.
 */

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我会火箭飞行");
    }
}
