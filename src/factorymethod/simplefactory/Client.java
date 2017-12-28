package factorymethod.simplefactory;

import factorymethod.Sender;

/**
 * @author Noblel
 * 工厂模式之简单模式
 */
public class Client {
    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Sender sender = factory.produce("mail");
        sender.send();
    }
}
