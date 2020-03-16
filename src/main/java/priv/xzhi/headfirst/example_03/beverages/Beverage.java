package priv.xzhi.headfirst.example_03.beverages;

/**
 * Desc: 饮料抽象类
 * Created by Xzhi on 2020-03-16 15:41.
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
