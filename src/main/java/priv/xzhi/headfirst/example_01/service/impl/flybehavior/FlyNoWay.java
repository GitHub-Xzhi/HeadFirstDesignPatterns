package priv.xzhi.headfirst.example_01.service.impl.flybehavior;

import priv.xzhi.headfirst.example_01.service.FlyBehavior;

/**
 * Desc:
 * Created by Xzhi on 2020-02-05 13:02.
 */

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我不会飞");
    }
}
