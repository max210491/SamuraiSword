/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samuraysword.carte.personaggio;

import CGCore.Game;
import CGCore.interfaces.Callback;
import CGCore.interfaces.TipoCarta;
import samuraysword.SamuraySword;
import samuraysword.carte.interfaces.Personaggio;

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

//    @Override
//    public boolean execute(Partita p) {
//        /*
//         * 
//         */
//    }
//
//    @Override
//    public CallbackManager.calType getCalbackType() {
//        return CallbackManager.calType.CHOSE_TARGET;
//    }

    @Override
    public Callback getCallback() {
        return new Callback(SamuraySword.chooseTarget){

            @Override
            public boolean execute(Game game) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean isValidCall(Game game) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
    }
}
