package factorymethod.morefactory;

import factorymethod.Sender;

/**
 *
 * @author Noblel
 * 工厂模式之多工厂模式
 */
public class Client {
    public static void main(String[] args){
        SendFactory factory = new SendFactory();
        Sender sender = factory.produceMail();
        sender.send();
    }
}
