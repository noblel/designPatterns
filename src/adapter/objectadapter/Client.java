package adapter.objectadapter;

/**
 * @author Noblel
 * 对象适配
 */
class Client {
    public static void main(String[] args) {
        VoltAdapter adapter = new VoltAdapter(new Volt220());
        System.out.println(adapter.getVolt5());
    }
}
