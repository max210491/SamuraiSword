/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samuraysword.carte;

import samuraysword.Carta;

/**
 *
 * @author Mirko
 */
public abstract class Arma implements Carta {

    private final int danno;
    private final int distanza;
    private final String descrizione;

    public Arma(String descrizione, int distanza, int danno) {
        this.descrizione = descrizione;
        this.danno = danno;
        this.distanza = distanza;
    }

    @Override
    public tipo getTipo() {
        return Carta.tipo.ARMA;
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
