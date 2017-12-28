package factorymethod.simplefactory;

import factorymethod.MailSender;
import factorymethod.Sender;
import factorymethod.SmsSender;

/**
 * @author Noblel
 * 创建工厂类
 */
public class SendFactory {
    public Sender produce(String type){
        if ("mail".equals(type)){
            return new MailSender();
        }else if("sms".equals(type)){
            return new SmsSender();
        }else {
            System.out.print("不是正确类型！");
            return null;
        }
    }
}
