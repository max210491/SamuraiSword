package CGCore;

import CGCore.exceptions.CGIllegalStateException;
import CGCore.interfaces.Carta;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Core di gioco. Un core è caratterizzato da diversi stati: - inizializzazione
 * - avvio - startGame - game - endGame - closing - end
 *
 * @author Simone
 */
public class CGCore {

    /**
     * INIT: Stato indicante la creazione del core. In questo stato è possibile
     * aggiungere carte e registrare le componenti
     *
     * LOAD: Stato indicante il caricamento delle componenti registrate nello
     * stato INIT.
     *
     * START_GAME: Stato indicante l'avvio del gioco. Permette la scelta del
     * numero di giocatori e altre impostazioni legate alla singola partita.
     *
     * GAME: Stato indicante una partita in corso di svolgimento
     *
     * END_GAME: Stato indicante il termine di una partita. E possibile
     * recuperare informazioni riguardo l'esito del match, decidere se
     * effettuare una nuova partita.
     *
     * UNLOAD: Stato indicante la chiusur del gioco e di eventuali collegamenti.
     *
     * END: stato indicante il corretto arresto del CGCore
     *
     * ERROR: Stati indicante una situazione di errore del CGCore.
     */
    protected static enum status {

        INIT, LOAD, START_GAME, GAME, END_GAME, UNLOAD, END, ERROR
    };
    private static CGCore core;
    private status status;
    private Map<String, String> tipiCarte;
    private Game game;
    private CallbackManager callbackManager;
    private CardManager cardManager;

    private CGCore() {
        this.status = status.INIT;
        this.tipiCarte = new HashMap<>();
        this.callbackManager = new CallbackManager();
        this.game = new Game(this);
        this.cardManager = new CardManager(this);
    }
    
    public void init(){
        if(this.status!=status.INIT){
            throw new CGIllegalStateException("La init del CGCore può essere chiamata solo una volta.");
        }
        status = status.LOAD;
        cardManager.init();
        
        
        
        status = status.START_GAME;
    }
    
    public status getStatus(){
        return status;
    }
    
    public Game getGame(){
        return game;
    }
    
    public CardManager getCardManager(){
        return cardManager;
    }
    
    protected CallbackManager getCallbackManager(){
        return callbackManager;
    }

    public static CGCore getCGCore() {
        if (core == null) {
            core = new CGCore();
        }
        return core;
    }
}
