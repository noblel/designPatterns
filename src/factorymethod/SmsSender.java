package factorymethod;


/**
 *
 * @author Noblel
 * 各自实现接口
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is smsSender!" );
    }
}
