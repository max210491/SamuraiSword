/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samuraysword;

import java.util.ArrayList;
import samuraysword.carte.Ruolo;

public class Giocatore {
    public String nome;
    public Ruolo ruolo;
    public ArrayList<Carta> mano =new ArrayList<Carta>();
    public int resistenza;
    public int resistenzaMax;
    ArrayList<Carta> Buff =new ArrayList<Carta>();
    public Giocatore(String s){
        nome=s;
    }
}
