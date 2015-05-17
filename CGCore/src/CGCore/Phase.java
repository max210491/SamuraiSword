/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CGCore;

import CGCore.Game;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author User
 */
public abstract class Phase {
    
    private Map<String, Object> map = new HashMap<>();
    
    protected void clear(){
        map.clear();
    }
    
    protected void run(Game g){
        clear();
        initPhase(map);
        executePhase(map, g);
        endPhase(map);
    }
    
    public abstract void initPhase(Map<String, Object> param);
    
    public abstract void executePhase(Map<String, Object> param, Game g);
    
    public abstract void endPhase(Map<String, Object> param);

}
