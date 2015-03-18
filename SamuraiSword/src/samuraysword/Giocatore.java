/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samuraysword;

import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Logger;
import samuraysword.carte.Ruolo;

public class Giocatore {
    public String nome;
    public Ruolo ruolo;
    public ArrayList<Carta> mano =new ArrayList<>();
    public int resistenza;
    public int resistenzaMax;
    ArrayList<Carta> Buff =new ArrayList<>();
    Random random = new Random();
    public Giocatore(String s){
        nome=s;
    }
    public void pesca(Partita p,int n){
        for(int i=0;i<n;i++){
            int rnd=random.nextInt(p.mazzo.size());
            mano.add(p.mazzo.get(rnd));
            p.mazzo.remove(rnd);
        }
    }
    public void turno(Partita p){
        pesca(p,2);
        p.turno=(p.turno+1)%p.giocatori.size();
    }
    private static final Logger LOG = Logger.getLogger(Giocatore.class.getName());
}
