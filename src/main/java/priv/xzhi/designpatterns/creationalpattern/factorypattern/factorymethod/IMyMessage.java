package priv.xzhi.designpatterns.creationalpattern.factorypattern.factorymethod;

import java.util.Map;

/**
 * Desc:工厂方法模式_产品接口
 * Created by Xzhi on 2019-09-12 17:14.
 */
public interface IMyMessage {
    Map<String, Object> getMessageParam();

    void setMessageParam(Map<String, Object> messageParam);

    void sendMessage() throws Exception;
}
