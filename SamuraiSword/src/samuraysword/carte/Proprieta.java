/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package samuraysword.carte;

import CGCore.interfaces.Carta;
import CGCore.interfaces.CartaConDescrizione;
import CGCore.interfaces.TipoCarta;

/**
 *
 * @author Simo
 */
public abstract class Proprieta implements CartaConDescrizione{
    
    private final String descrizione;
    private final TipoCarta tipo;
    
    public Proprieta(TipoCarta tipo, String descrizione){
        this.descrizione = descrizione;
        this.tipo = tipo;
    }
    
    @Override
    public TipoCarta getTipo() {
        return tipo;
    }

    public String getDescrizione() {
        return descrizione;
    }
    
}
