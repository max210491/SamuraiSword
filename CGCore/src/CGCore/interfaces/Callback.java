/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CGCore.interfaces;

import CGCore.Game;

/**
 * Interfaccia principale per le Callback: queste vengono eseguite dalla partita
 * in momenti predeterminati. Il Nome passato è l'identificativo che verrà usato
 * per richiamare la callback.
 *
 * @author Simo
 */
public abstract class Callback {

    private final String name;

    public Callback(String name) {
        this.name = name;
    }

    /**
     * Metodo principale eseguito quando la callback viene chiamata e risulta
     * valida.
     *
     * @param game La partita correntemente attiva
     * @return boolean che indica il successo della chiamata
     */
    public abstract boolean execute(Game game);

    /**
     * Metodo che verifica se la callback è valida. Viene invocato subio prima
     * di execute().
     *
     * @param game La partita corrrentemente attiva
     * @return boolean che indica se la chiamata è valida. Se il metodo
     * restituisce true allora verrà invocato execute().
     */
    public abstract boolean isValidCall(Game game);

    /**
     * Il metodo restituisce il nome, nonche identificativo della callback.
     * @return 
     */
    public String getCalbackName() {
        return name;
    }
}
