/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samuraysword.carte.personaggio;

import java.util.ArrayList;
import samuraysword.Carta;
import samuraysword.Giocatore;
import samuraysword.Partita;
import samuraysword.carte.Personaggio;
import samuraysword.carte.Ruolo;
import samuraysword.partita.ComplexAction;

/**
 *
 * @author Mirko
 */
public class Benkei extends Personaggio {

    public Benkei() {
        super(5, "Non ho idea della descrizione");
    }

    @Override
    public String getName() {
        return "Benkei";
    }

    @Override
    public void runCallback(Partita p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ComplexAction.tipoAzione getTipoCall() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
