/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CGCore;

import CGCore.interfaces.Carta;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe rappresentante una partita, un GAME
 * @author Simo
 */
public class Game {
    
    private List<Phase> phase;
    private final CGCore core;
    private int activePlayer;
    private List<Player> players;
    private List<Carta> mazzo;
    private List<Carta> scarti;
    
    public Game(CGCore core){
        this.core = core;
        this.phase = new ArrayList<>();
        this.activePlayer = 0;
        this.players = new ArrayList<>();
    }
    
    public void addPlayer(Player p){
        this.players.add(p);
    }
    
    public Player getPlayer(int i){
        return players.get(i);
    }
    
    public Player getActivePlayer(){
        return getPlayer(activePlayer);
    }
    
    public void nextPlayer(){
        activePlayer = (activePlayer +1) % players.size();
    }
    
    public void setMazzo(List<Carta> l){
        this.mazzo = new ArrayList(l);
    }

    public List<Carta> getMazzo() {
        return mazzo;
    }

    public List<Carta> getScarti() {
        return scarti;
    }
    
    public Carta pesca(){
        if(mazzo.size()<1){
            return null;
        }
        return mazzo.remove(0);
    }
    
    public List<Carta> pesca(int n){
        List<Carta> l = new ArrayList<>();
        for (int i=0; i<n; i++){
            Carta c = pesca();
            if(c!=null){
                l.add(c);
            }
        }
        return l;
    }
    
    protected void runTurn(){
        for(Phase p : phase){
            p.run(this);
        }
    }
    
    public void addPhase(Phase p){
        phase.add(p);
    }
    
    public CallbackManager getCallbackManager(){
        return core.getCallbackManager();
    }
    
}
