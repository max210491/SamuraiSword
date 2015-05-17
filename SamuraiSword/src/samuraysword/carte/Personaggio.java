/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package samuraysword.carte;

import CGCore.interfaces.Carta;
import CGCore.interfaces.CartaConDescrizione;
import CGCore.interfaces.TipoCarta;
import CGCore.interfaces.Callback;
import CGCore.interfaces.HasCallback;

/**
 * La classe personaggio è più complicata in quanto ogni personaggio ha le sue
 * caratteristiche e soprattutto la sua abilità.
 * 
 * @author Simo
 */
public abstract class Personaggio implements CartaConDescrizione, HasCallback{

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

    @Override
    public String getDescription() {
        return descrizione;
    }
 
}
