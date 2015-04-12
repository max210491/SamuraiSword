/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samuraysword.carte.personaggio;

import java.util.ArrayList;
import samuraysword.Carta;
import samuraysword.partita.Giocatore;
import samuraysword.Partita;
import samuraysword.carte.Personaggio;
import samuraysword.carte.Ruolo;
import samuraysword.partita.CallbackManager;

/**
 *
 * @author Mirko
 */
public class Benkei extends Personaggio {

    public Benkei() {
        super(5, "Tutti gli altri giocatori hanno Difficoltà +1 quando ti attaccano.");
    }

    @Override
    public String getName() {
        return "Benkei";
    }

    @Override
    public boolean execute(Partita p) {
        /*
         * 
         */
    }

    @Override
    public CallbackManager.calType getCalbackType() {
        return CallbackManager.calType.CHOSE_TARGET;
    }
}
