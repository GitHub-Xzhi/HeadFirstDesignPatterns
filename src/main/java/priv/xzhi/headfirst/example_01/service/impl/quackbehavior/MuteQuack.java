package priv.xzhi.headfirst.example_01.service.impl.quackbehavior;

import priv.xzhi.headfirst.example_01.service.QuackBehavior;

/**
 * Desc:
 * Created by Xzhi on 2020-02-05 13:05.
 */

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("我不会叫");
    }
}
