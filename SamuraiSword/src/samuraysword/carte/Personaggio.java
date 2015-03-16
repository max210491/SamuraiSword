/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package samuraysword.carte;

import samuraysword.Carta;
import samuraysword.partita.SkillCallback;

/**
 * La classe personaggio è più complicata in quanto ogni personaggio ha le sue
 * caratteristiche e soprattutto la sua abilità.
 * 
 * @author Simo
 */
public abstract class Personaggio extends Carta implements SkillCallback{

    private String descrizione;
    private final int resistenzaMax;
    private int resistenza;
    
    public Personaggio(int resistenza, String descrizione){
        this.resistenza = resistenza;
        this.resistenzaMax = resistenza;
        this.descrizione = descrizione;
    }
    
    @Override
    public tipo getTipo() {
        return Carta.tipo.PERSONAGGIO;
    }

    public int getResistenza() {
        return resistenza;
    }

    public void setResistenza(int vita) {
        this.resistenza = vita;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public int getResistenzaMax() {
        return resistenzaMax;
    }
    
    
 
}
