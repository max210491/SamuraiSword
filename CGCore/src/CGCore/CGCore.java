package CGCore;

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

    private static enum status {

        INIT, LOAD, START_GAME, GAME, END_GAME, UNLOAD, END
    };
    
    
    private status status;
    private List<Carta> mazzoCompleto, mazzoGioco, mazzoDisabled;
    private Map<String, String> tipiCarte;

    private CGCore() {
        this.status = status.INIT;
        this.mazzoCompleto = new ArrayList<>();
        this.tipiCarte = new HashMap<>();
    }
    private static CGCore core;

    public static CGCore getCGCore() {
        if (core == null) {
            core = new CGCore();
        }
        return core;
    }
}
