package adapter.classadapter;

/**
 * @author Noblel
 * 类适配
 */
class Client {
    public static void main(String[] args) {
        VoltAdapter adapter = new VoltAdapter();
        System.out.println(adapter.getVolt5());
    }
}
