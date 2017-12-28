package abstractfactory;

/**
 * @author Noblel
 * 发送Email工厂
 */
public class SendMailFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
