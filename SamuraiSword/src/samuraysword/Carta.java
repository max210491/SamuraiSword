/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samuraysword;

/**
 * Classe generic per la gestione delle carte
 * 
 * @author Mirko
 */
public abstract class Carta {
    
    /**
     * I nomi sono modificabili: ruolo(ronin ecc), personaggio, arma, supporto(carte blu), azione(carte gialle)
     */
    public static enum tipo {RUOLO, PERSONAGGIO, ARMA, SUPPORTO, AZIONE};
    
    /**
     * 
     * @return Il tipo della carta
     */
    public abstract tipo getTipo();
    
    public abstract String getName();
    
}
