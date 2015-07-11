/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package samuraysword.carte.armi;

import CGCore.interfaces.TipoCarta;
import samuraysword.carte.interfaces.Arma;

/**
 *
 * @author User
 */
public class Kusarigama extends Arma{

    public Kusarigama(TipoCarta t){
        super(t, 2, 2);
    }

    @Override
    public String getName() {
        return "KUSARIGAMA";
    }
}
