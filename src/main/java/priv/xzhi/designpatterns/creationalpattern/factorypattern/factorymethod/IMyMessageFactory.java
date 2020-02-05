package priv.xzhi.designpatterns.creationalpattern.factorypattern.factorymethod;

/**
 * Desc: 工厂方法模式_工厂接口
 * Created by Xzhi on 2019-09-12 17:09.
 */

interface IMyMessageFactory {
    IMyMessage createMessage(String messageType);
}
