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
public class Arma extends Carta {
    public int danno=0;
    public int distanza=0;
    public Arma(String s,int distanzaI, int dannoI) {
        super(s);
        danno=dannoI;
        distanza=distanzaI;
    }
    @Override
    public String toString(){
        return "ARMA "+nome+" Dist:"+distanza+" Danno:"+danno;
    }
}
