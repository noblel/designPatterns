package factorymethod.morefactory;

import factorymethod.MailSender;
import factorymethod.Sender;
import factorymethod.SmsSender;

/**
 * @author Noblel
 * 创建工厂类
 */
class SendFactory {
    public Sender produceMail(){
        return new MailSender();
    }

    public Sender produceSms(){
        return new SmsSender();
    }
}
