/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samuraysword.carte;

import CGCore.interfaces.Carta;
import CGCore.interfaces.TipoCarta;
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
    private final TipoCarta tipo;
    
    /**
     * Il costruttore
     * @param onore iniziale del ruolo durante la partita
     */
    public Ruolo(TipoCarta tipo, type classe){
        this.classe = classe;
        this.tipo = tipo;
    }

    @Override
    public TipoCarta getTipo() {
        return tipo;
    }

    public type getClasse() {
        return classe;
    }

}
