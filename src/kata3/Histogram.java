package kata3;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author Ángel H.O
 */
public class Histogram<T>{
    private Map<T, Integer> map = new HashMap<T, Integer>();
    
    public Integer get(T key){
        return map.get(key);
    }
    
    public Set<T> keySet(){
        return map.keySet();
    }
    
    public void increment(T key){
        this.map.put(key, this.map.containsKey(key) ?  this.map.get(key) + 1 : 1);
    }
}
