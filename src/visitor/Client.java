package visitor;

import java.util.List;

/**
 * @author Noblel
 *
 */
public class Client {
    public static void main(String[] args) {
        List<AbstractElement> list = ObjectStructure.getList();
        for (AbstractElement e : list) {
            e.accept(new Visitor());
        }
    }
}
