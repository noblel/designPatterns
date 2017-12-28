package abstractfactory;

/**
 * @author Noblel
 * 发送Email具体实现
 */
class MailSender implements Sender{
    @Override
    public void send() {
        System.out.println("this is mailSender!");
    }
}
