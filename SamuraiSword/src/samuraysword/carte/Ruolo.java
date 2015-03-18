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
    
    private int onore;
    
    /**
     * Il costruttore
     * @param onore iniziale del ruolo durante la partita
     */
    public Ruolo(int onore){
        this.onore = onore;
    }

    @Override
    public tipo getTipo() {
        return Carta.tipo.RUOLO;
    }

    public int getOnore() {
        return onore;
    }

    public void setOnore(int onore) {
        this.onore = onore;
    }
    
    
    
}
