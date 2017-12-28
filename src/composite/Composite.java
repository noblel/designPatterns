package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Noblel
 */
public class Composite extends Component {

    /**
     * 用来保存节点的子节点
     */
    List<Component> list = new ArrayList<>();

    @Override
    public void add(Component component) {
        list.add(component);
    }

    @Override
    public void remove(Component component) {
        list.remove(component);
    }

    @Override
    public void eachChild() {
        System.out.println(name+"执行了");
        for (Component c :
                list) {
            c.eachChild();
        }
    }
}
