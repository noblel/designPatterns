package memo.multimode;

/**
 * @author Noblel
 * 多状态多备份
 */
public class Client2 {
    public static void main(String[] args) {
        Originator2 originator2 = new Originator2();
        Caretaker2 caretaker2 = new Caretaker2();
        originator2.setState1("中国");
        originator2.setState2("强盛");
        originator2.setState3("繁荣");
        System.out.println("===初始化状态===\n"+originator2);

        caretaker2.setMemento("001",originator2.createMemento());
        originator2.setState1("软件");
        originator2.setState2("架构");
        originator2.setState3("优秀");
        System.out.println("===修改后状态===\n"+originator2);

        originator2.restoreMemento(caretaker2.getMemento("001"));
        System.out.println("===恢复后状态===\n"+originator2);
    }
}
