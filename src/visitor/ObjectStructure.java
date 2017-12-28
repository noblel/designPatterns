package visitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Noblel
 */
public class ObjectStructure {

    public static List<AbstractElement> getList(){
        List<AbstractElement> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int a = random.nextInt(100);
            if (a > 50){
                list.add(new ConcreteElement1());
            }else {
                list.add(new ConcreteElement2());
            }
        }
        return list;
    }
}
