package iterator;

/**
 * @author Noblel
 * 迭代器模式
 */
public class Client {
    public static void main(String[] args) {
        Aggregate ag = new ConcreteAggregate();
        ag.add("小明");
        ag.add("小红");
        ag.add("小黄");
        Iterator it = ag.iterator();
        while (it.hasNext()) {
            System.out.println((String) it.next());
        }
    }
}
