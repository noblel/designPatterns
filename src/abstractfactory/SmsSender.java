package abstractfactory;

/**
 * @author Noblel
 * 发送Sms具体实现
 */
class SmsSender implements Sender{
    @Override
    public void send() {
        System.out.println("this is sms sender");
    }
}
