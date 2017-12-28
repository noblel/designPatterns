package memo.multimode;

import java.util.Map;

/**
 * @author Noblel
 */
public class Memento2 {
    private Map<String, Object> stateMap;

    public Memento2(Map<String, Object> map){
        this.stateMap = map;
    }

    public Map<String, Object> getStateMap() {
        return stateMap;
    }

    public void setStateMap(Map<String, Object> stateMap) {
        this.stateMap = stateMap;
    }


}
