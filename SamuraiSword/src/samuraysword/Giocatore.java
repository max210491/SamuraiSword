/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samuraysword;

import java.util.ArrayList;
import samuraysword.carte.Ruolo;

public class Giocatore {
    String nome;
    Ruolo ruolo;
    Carta personaggio;
    ArrayList<Carta> mano =new ArrayList<Carta>();
    public Giocatore(String s,Ruolo r,Carta p){
        nome=s;
        ruolo=r;
        personaggio=p;
    }
}
