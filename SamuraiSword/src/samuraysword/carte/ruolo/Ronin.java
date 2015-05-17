/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package samuraysword.carte.ruolo;

import CGCore.interfaces.TipoCarta;
import samuraysword.carte.Ruolo;

/**
 * Ecco la classe Ronin. snella e pulita.
 * 
 * @author User
 */
public class Ronin extends Ruolo{

    public Ronin(TipoCarta t){
        super(t, type.RONIN); 
    }
    
    @Override
    public String getName() {
        return "Ronin";
    }
    
}
