package factorymethod.staticfactory;

import factorymethod.MailSender;
import factorymethod.Sender;
import factorymethod.SmsSender;

/**
 * @author Noblel
 * 工厂模式之静态工厂模式
 */
public class SendFactory {
    public static Sender produceMail(){
        return new MailSender();
    }

    public static Sender produceSms(){
        return new SmsSender();
    }
}
