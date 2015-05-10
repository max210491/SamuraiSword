/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samuraysword.carte;

import CGCore.interfaces.Carta;
import CGCore.interfaces.CartaConDescrizione;
import CGCore.interfaces.TipoCarta;

/**
 *
 * @author Mirko
 */
public abstract class Arma implements CartaConDescrizione {

    private final int danno;
    private final int distanza;
    private final String descrizione;
    private final TipoCarta tipo;

    public Arma(TipoCarta tipo, String descrizione, int distanza, int danno) {
        this.descrizione = descrizione;
        this.danno = danno;
        this.distanza = distanza;
        this.tipo = tipo;
    }

    @Override
    public TipoCarta getTipo() {
        return tipo;
    }

    public int getDanno() {
        return danno;
    }

    public int getDistanza() {
        return distanza;
    }

    public String getDescrizione() {
        return descrizione;
    }
}
