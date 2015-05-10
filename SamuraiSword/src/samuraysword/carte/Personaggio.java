/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package samuraysword.carte;

import CGCore.interfaces.Carta;
import CGCore.interfaces.CartaConDescrizione;
import CGCore.interfaces.TipoCarta;
import samuraysword.callback.Callback;

/**
 * La classe personaggio è più complicata in quanto ogni personaggio ha le sue
 * caratteristiche e soprattutto la sua abilità.
 * 
 * @author Simo
 */
public abstract class Personaggio implements CartaConDescrizione, Callback {

    private final String descrizione;
    private final int resistenza;
    private final TipoCarta tipo;
    
    public Personaggio(TipoCarta tipo, int resistenza, String descrizione){
        this.resistenza = resistenza;
        this.descrizione = descrizione;
        this.tipo = tipo;
    }
    
    @Override
    public TipoCarta getTipo() {
        return tipo;
    }

    public int getResistenza() {
        return resistenza;
    }

    public String getDescrizione() {
        return descrizione;
    }
 
}
