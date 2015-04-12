/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samuraysword;

import samuraysword.partita.Giocatore;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Logger;
import samuraysword.callback.Callback;
import samuraysword.carte.*;
import samuraysword.partita.Action;
import samuraysword.partita.CallbackManager;

/**
 *
 * @author Mirko
 */
public class Partita {

    private List<Carta> mazzo = new ArrayList<>();
    private List<Carta> scarti = new ArrayList<>();
    private List<Giocatore> giocatori = new ArrayList<>();
    private Random random = new Random();
    private CallbackManager cb = new CallbackManager();
    private int active_player;
    private List<Action> actions;
//    int turno=0;

    /**
     *
     */
    public Partita() {
//        preparativi();
//        printState();
//        giocatori.get(turno).turno(this);
//        printState();
//        giocatori.get(turno).turno(this);
//        printState();
//        giocatori.get(turno).turno(this);
//        printState();
//        giocatori.get(turno).turno(this);
//        printState();
    }
//    public void preparativi(){
//        for(int i=0;i<60;i++)
//            mazzo.add(new Carta(""+i));
//        ArrayList<Carta> temp1=new ArrayList<Carta>();
//        temp1.add(new Ruolo("Shogun",5));
//        temp1.add(new Ruolo("Samurai",4));
//        temp1.add(new Ruolo("Samurai",4));
//        temp1.add(new Ruolo("Ronin",4));
//        temp1.add(new Ruolo("Ninja",4));
//        temp1.add(new Ruolo("Ninja",4));
//        
//        ArrayList<Giocatore> temp2 = new ArrayList<Giocatore>();
//        temp2.add(new Benkei());
//        temp2.add(new Benkei());
//        temp2.add(new Benkei());
//        temp2.add(new Benkei());
//        temp2.add(new Chiyome());
//        temp2.add(new Chiyome());
//        while(temp1.isEmpty()==false){
//            giocatori.add(editGiocatore(temp1,temp2));
//        }
//        for(int i=0;i<giocatori.size();i++){
//            if(giocatori.get(i).ruolo.nome=="Shogun")
//                turno=i;
//        }
//        for(int i=0;i<giocatori.size();i++){
//            giocatori.get((i+turno)%(giocatori.size())).pesca(this,4+((i+1)/2));
//        }
//    }

    /**
     *
     * @param temp1
     * @param temp2
     * @return
     */
    public Giocatore editGiocatore(ArrayList<Carta> temp1, ArrayList<Giocatore> temp2) {
        int rnd1 = random.nextInt(temp1.size());
        int rnd2 = random.nextInt(temp2.size());
        Giocatore temp = temp2.get(rnd2);
        temp2.remove(rnd2);
//        temp.ruolo=(Ruolo) temp1.get(rnd1);
        temp1.remove(rnd1);
        return temp;
    }

    /**
     *
     */
    public void printState() {
        for (int i = 0; i < giocatori.size(); i++) {
            Giocatore t = giocatori.get(i);
//            System.out.println(t.nome +  " " + t.ruolo.nome +" " + t.resistenza+ "♥ " + t.ruolo.onore+"♣");
//            for(int j=0;j<t.mano.size();j++){
//                System.out.println("\t"+t.mano.get(j).nome);
//            }
        }
    }

    private boolean turno(Giocatore g) {
        if (!faseRecupero(g)) {
            LOG.severe("Errore durante la fase di Recupero");
            return false;
        }
        if (!fasePesta(g)) {
            LOG.severe("Errore durante la fase di Pesca");
            return false;
        }
        if (!faseGioca(g)) {
            LOG.severe("Errore durante la fase di Gioco");
            return false;
        }
        if (!faseScarta(g)) {
            LOG.severe("Errore durante la fase di Scarta");
            return false;
        }
        return true;
    }

    private boolean faseRecupero(Giocatore g) {
        cb.runCallback(CallbackManager.calType.FASE_RECUPERO, this);

        //implementare la logica della fase di recupero

        return true;
    }

    private boolean fasePesta(Giocatore g) {
        cb.runCallback(CallbackManager.calType.FASE_PESCA, this);

        //implementare la logica della fase di pesca

        return true;
    }
    private boolean fineFaseGioca;

    private boolean faseGioca(Giocatore g) {
        cb.runCallback(CallbackManager.calType.FASE_GIOCA, this);

        //implementare la logica della fase di gioco
        initActions(g);
        cb.runCallback(CallbackManager.calType.CHOSE_ACTION, this);

        fineFaseGioca = false;
        do {
            //il giocatore sceglie una possibile azione
            Action action = null;
            //action = chooseAction()

            if (action == null || !action.runAction()) {
                LOG.severe("Impossibile eseguire l'azione");
                return false;
            }

        } while (!fineFaseGioca);

        return true;
    }

    public void setEndTurno() {
        fineFaseGioca = true;
    }

    private boolean faseScarta(Giocatore g) {
        cb.runCallback(CallbackManager.calType.FASE_SCARTA, this);

        //implementare la logica della fase di scarta

        return true;
    }

    private void initActions(Giocatore g) {
        if (actions != null) {
            actions.clear();
        }
        for (Carta c : g.getMano()) {
            actions.add(new Action(this, c));
        }
        actions.add(new Action(this, new Callback() {
            @Override
            public boolean execute(Partita p) {
                p.setEndTurno();
                return true;
            }

            @Override
            public CallbackManager.calType getCalbackType() {
                return CallbackManager.calType.END_TURNO;
            }
        }, "Termina turno"));
    }

    public boolean startAttack() {

        //Attacco

        return true;
    }

    public boolean startAction() {

        //Azione

        return true;
    }

    public boolean startSupport() {

        //support

        return true;
    }

    public Giocatore getActivePlayer() {
        return giocatori.get(active_player);
    }

    public Giocatore getNextPlayer() {
        return giocatori.get((active_player + 1) % giocatori.size());
    }
    
    public List<Giocatore> getOtherPlayer() {
        List<Giocatore> other = new ArrayList<>();
        for (Giocatore g : giocatori){
            if (!g.equals(active_player))
                other.add(g);
        }
        return other;
    }
    
    public List<Giocatore> getOtherAlivePlayer(){
        List<Giocatore> otherAlive = new ArrayList<>();
        for (Giocatore g : giocatori){
            if (!g.equals(active_player) && g.isAlive())
                otherAlive.add(g);
        }
        return otherAlive;
    }

    public List<Action> getPlayerActions() {
        return actions;
    }
    private static final Logger LOG = Logger.getLogger(Partita.class.getName());
}
