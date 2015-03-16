/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package samuraysword.partita;

import samuraysword.Partita;
import samuraysword.partita.ComplexAction.tipoAzione;

/**
 * Interfaccia di callback per le skill dei personaggi
 * 
 * @author Simo
 */
public interface SkillCallback {
    
    public void runCallback(Partita p);
    
    public tipoAzione getTipoCall();
    
}
