package priv.xzhi.headfirst.example_02.service.impl;

import priv.xzhi.headfirst.example_02.service.DisplayElement;
import priv.xzhi.headfirst.example_02.service.Observer;
import priv.xzhi.headfirst.example_02.service.Subject;

/**
 * Desc:
 * Created by Xzhi on 2020-02-07 18:52.
 */

public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temp;
    private float humidity;
    private Subject subject;

    public CurrentConditionDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temp
                + "F degrees and " + humidity + "% humidity");
    }
}
