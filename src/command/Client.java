package command;

/**
 * @author Noblel
 * 命令模式
 */
public class Client {
    public static void main(String[] args) {
        //接收者
        Receiver receiver = new Receiver();
        //根据接收者构造一个命令对象
        Command command = new ConcreteCommand(receiver);

        //客户端直接执行具体命令方式
        command.execute();

        //客户端通过调用者来执行命令
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.action();
    }
}
