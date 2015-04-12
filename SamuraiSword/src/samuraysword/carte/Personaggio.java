/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package samuraysword.carte;

import samuraysword.Carta;
import samuraysword.callback.Callback;

/**
 * La classe personaggio è più complicata in quanto ogni personaggio ha le sue
 * caratteristiche e soprattutto la sua abilità.
 * 
 * @author Simo
 */
public abstract class Personaggio implements Carta, Callback {

    private final String descrizione;
    private final int resistenza;
    
    public Personaggio(int resistenza, String descrizione){
        this.resistenza = resistenza;
        this.descrizione = descrizione;
    }
    
    @Override
    public tipo getTipo() {
        return Carta.tipo.PERSONAGGIO;
    }

    public int getResistenza() {
        return resistenza;
    }

    public String getDescrizione() {
        return descrizione;
    }
 
}
