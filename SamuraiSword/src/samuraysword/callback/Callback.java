/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package samuraysword.callback;

import samuraysword.Partita;
import samuraysword.partita.CallbackManager;

/**
 * Interfaccia principale per le Callback: queste vengono eseguite dalla partita
 * in momenti predeterminati.
 * @author Simo
 */
public interface Callback {
    
    public boolean execute(Partita p);
    
    public CallbackManager.calType getCalbackType();
    
}
