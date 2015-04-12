/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samuraysword.carte;

import samuraysword.*;

/**
 * Non ha senso mettere il nome nel costruttore, Il nome è una caratteristica
 * intrinseca della carte che non viene modificata nemmno alla creazione.
 * 
 * @author Mirko
 */
public abstract class Ruolo implements Carta{
    
    public static enum type {RONIN, NINJA, SAMURAI, SHOGUN};
    
    private final type classe;
    
    /**
     * Il costruttore
     * @param onore iniziale del ruolo durante la partita
     */
    public Ruolo(type classe){
        this.classe = classe;
    }

    @Override
    public tipo getTipo() {
        return Carta.tipo.RUOLO;
    }

    public type getClasse() {
        return classe;
    }

}
