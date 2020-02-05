package priv.xzhi.headfirst.example_01.service.impl.quackbehavior;

import priv.xzhi.headfirst.example_01.service.QuackBehavior;

/**
 * Desc:
 * Created by Xzhi on 2020-02-05 13:04.
 */

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("我会呱呱叫");
    }
}
