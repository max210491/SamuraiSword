/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samuraysword.carte.interfaces;

import CGCore.interfaces.Carta;
import CGCore.interfaces.CartaConDescrizione;
import CGCore.interfaces.TipoCarta;
import samuraysword.SamuraySword;

/**
 *
 * @author Mirko
 */
public abstract class Arma implements Carta {

    private final int danno;
    private final int distanza;

    public Arma(TipoCarta tipo, int distanza, int danno) {
        this.danno = danno;
        this.distanza = distanza;
    }

    @Override
    public TipoCarta getTipo() {
        return SamuraySword.ARMA;
    }

    public int getDanno() {
        return danno;
    }

    public int getDistanza() {
        return distanza;
    }

}
