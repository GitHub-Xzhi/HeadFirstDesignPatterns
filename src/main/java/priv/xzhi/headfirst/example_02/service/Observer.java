package priv.xzhi.headfirst.example_02.service;

/**
 * Desc: 观察者
 * Created by Xzhi on 2020-02-06 18:45.
 */

public interface Observer {
    void update(float temp, float humidity, float pressure);
}
