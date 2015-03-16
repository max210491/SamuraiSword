/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samuraysword;

import java.util.ArrayList;
import samuraysword.carte.Personaggio;
import samuraysword.carte.Ruolo;

    
/**
 *
 * @author Mirko
 */
public class Partita {
    ArrayList<Carta> mazzo=new ArrayList<Carta>();
    ArrayList<Carta> scarti=new ArrayList<Carta>();
    ArrayList<Giocatore> giocatori=new ArrayList<Giocatore>();
    public Partita(){
        preparativi();
    }
     public void preparativi(){
        for(int i=0;i<60;i++)
            mazzo.add(new Carta(""+i));
        for(int i=0;i<6;i++)
            giocatori.add(new Giocatore("nome:"+i,new Ruolo("ruolo:"+i,3),new Personaggio("pers:"+i,4)));
        //start shogun
        for(int i=0;i<6;i++){
            for(int j=0;j<5+(i/2);j++){
                Carta t = mazzo.get(0);
                mazzo.remove(0);
                giocatori.get(i).mano.add(t);
                
            }
        }
    }
}
