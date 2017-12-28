package memo.multimode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Noblel
 */
class Caretaker2 {
    private Map<String, Memento2> memMap = new HashMap<>();

    public Memento2 getMemento(String index){
        return memMap.get(index);
    }

    public void setMemento(String index, Memento2 memento){
        this.memMap.put(index, memento);
    }
}
