package priv.xzhi.headfirst.example_03.beverages;

/**
 * Desc: 浓缩咖啡
 * Created by Xzhi on 2020-03-16 15:51.
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "浓缩咖啡";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
