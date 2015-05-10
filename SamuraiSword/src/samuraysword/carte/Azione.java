/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package samuraysword.carte;

import CGCore.interfaces.Carta;

/**
 *
 * @author User
 */
public abstract class Azione implements Carta{
    
    private final String descrizione;
    
    public Azione(String descrizione){
        this.descrizione = descrizione;
    }

    public String getDescrizione() {
        return descrizione;
    }
    
}
