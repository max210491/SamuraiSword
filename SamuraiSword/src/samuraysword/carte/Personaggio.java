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
public class Personaggio extends Carta {
        int resistenza;
        int resistenzaMax;
        public Personaggio(String n, int r){
            super(n);
            resistenza=r;
            resistenzaMax=r;
        }
}
