package priv.xzhi.headfirst.example_03.beverages;

/**
 * Desc: 综合咖啡
 * Created by Xzhi on 2020-03-16 15:51.
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "综合咖啡";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
