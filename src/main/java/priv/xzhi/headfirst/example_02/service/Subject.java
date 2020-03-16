package priv.xzhi.headfirst.example_02.service;

/**
 * Desc: 主题
 * Created by Xzhi on 2020-02-06 18:40.
 */

public interface Subject {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
