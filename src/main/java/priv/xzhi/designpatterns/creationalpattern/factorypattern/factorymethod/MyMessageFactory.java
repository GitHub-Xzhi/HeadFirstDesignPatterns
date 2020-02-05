package priv.xzhi.designpatterns.creationalpattern.factorypattern.factorymethod;

import java.util.HashMap;
import java.util.Map;

/**
 * Desc:工厂实现
 * Created by Xzhi on 2019-09-12 17:18.
 */
public class MyMessageFactory implements IMyMessageFactory {

    @Override
    public IMyMessage createMessage(String messageType) {
        // 这里的方式是：消费者知道自己想要什么产品；若生产何种产品完全由工厂决定，则这里不应该传入控制生产的参数。

        IMyMessage myMessage;
        Map<String, Object> messageParam = new HashMap<>();
        // 根据某些条件去选择究竟创建哪一个具体的实现对象，条件可以传入的，也可以从其它途径获取。  
        // sms  
        if("SMS".equals(messageType)) {
            myMessage = new MyMessageSms();
        }

        return null;
    }
}
