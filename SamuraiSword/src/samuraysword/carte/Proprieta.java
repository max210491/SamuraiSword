/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package samuraysword.carte;

import samuraysword.Carta;

/**
 *
 * @author Simo
 */
public abstract class Proprieta implements Carta{
    
    private final String descrizione;
    
    public Proprieta(String descrizione){
        this.descrizione = descrizione;
    }
    
    @Override
    public tipo getTipo() {
        return Carta.tipo.SUPPORTO;
    }

    public String getDescrizione() {
        return descrizione;
    }
    
}
