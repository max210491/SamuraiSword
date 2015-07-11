/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package samuraysword.carte;

import CGCore.interfaces.Callback;
import CGCore.interfaces.Carta;
import CGCore.interfaces.CartaConDescrizione;
import CGCore.interfaces.HasCallback;
import CGCore.interfaces.TipoCarta;
import samuraysword.SamuraySword;

/**
 *
 * @author User
 */
public abstract class Azione implements CartaConDescrizione, HasCallback{

    @Override
    public TipoCarta getTipo() {
        return SamuraySword.AZIONE;
    }
}
