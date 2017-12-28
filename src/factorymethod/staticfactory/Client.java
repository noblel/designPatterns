package factorymethod.staticfactory;

import factorymethod.Sender;

/**
 * @author Noblel
 * 工厂模式之静态工厂模式
 */
public class Client {
    public static void main(String[] args) {
        Sender sender = SendFactory.produceSms();
        sender.send();
    }
}
