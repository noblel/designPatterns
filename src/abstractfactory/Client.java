package abstractfactory;

/**
 * @author Noblel
 * 抽象工厂模式--拓展只需要新建一个类实现Provider接口即可
 */
class Client {
    public static void main(String[] args) {
        Provider provider = new SendMailFactory();
        Sender produce = provider.produce();
        produce.send();
    }
}
