package priv.xzhi.headfirst.example_03;

import priv.xzhi.headfirst.example_03.beverages.Beverage;
import priv.xzhi.headfirst.example_03.beverages.Espresso;
import priv.xzhi.headfirst.example_03.beverages.HouseBlend;
import priv.xzhi.headfirst.example_03.decorator.Mocha;
import priv.xzhi.headfirst.example_03.decorator.Soy;
import priv.xzhi.headfirst.example_03.decorator.Whip;

/**
 * Desc:
 * Created by Xzhi on 2020-03-16 10:59.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("一杯浓缩咖啡");
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + "$" + espresso.cost());
        System.out.println("两倍摩卡奶油综合咖啡");
        Beverage houseBlend = new HouseBlend();
        houseBlend = new Whip(new Mocha(new Mocha(houseBlend)));
        System.out.println(houseBlend.getDescription() + "$" + houseBlend.cost());
        System.out.println("再来一杯豆浆、摩卡、奶泡的HouseBlend咖啡");
        Beverage houseBlend2 = new HouseBlend();
        houseBlend2 = new Soy(new Mocha(new Whip(houseBlend2)));
        System.out.println(houseBlend2.getDescription() + "$" + houseBlend2.cost());

    }
}
