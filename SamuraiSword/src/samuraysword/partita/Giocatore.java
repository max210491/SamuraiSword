/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samuraysword.partita;

import CGCore.Player;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Logger;
import CGCore.interfaces.Carta;
import samuraysword.Partita;
import samuraysword.carte.interfaces.Ruolo;
import samuraysword.carte.interfaces.Personaggio;

public class Giocatore extends Player{
    
    private Ruolo ruolo;
    private Personaggio personaggio;
    private int resistenza;
    private int onore;
    private List<Carta> buff =new ArrayList<>();
    
    Random random = new Random();
    
    public Giocatore(String s){
        super(s);
    }
    
//    public void pesca(Partita p,int n){
//        for(int i=0;i<n;i++){
////            if(p.mazzo.size()==0){
////                p.mazzo=p.scarti;
////                p.scarti=new ArrayList<Carta>();
////                for(int j=0;j<p.giocatori.size();j++)
////                    p.giocatori.get(j).ruolo.onore--;
////            }
////            else{
////                int rnd=random.nextInt(p.mazzo.size());
////                mano.add(p.mazzo.get(rnd));
////                p.mazzo.remove(rnd);
////            }
//        }
//    }
//    public void turno(Partita p){
////        if(resistenza <=0)
////            resistenza=resistenzaMax;
//        pesca(p,2);
////        //equippa
////        //gialle
////        attacca(p,p.giocatori.get((p.turno+1)%p.giocatori.size()),(Arma)mano.get(0));
////        while(mano.size()>7)
////            mano.remove(0);
//    }
////    public void attacca(Partita p,Giocatore g,Arma a){
////        g.mano.remove(a);
////        p.scarti.add(a);
////        //se lo raggiunge e non para
////        g.danno(this,a);
////    }
////    public void danno(Giocatore g,Arma a){
////        resistenza-=a.danno;
////        if(resistenza<=0){
////            g.ruolo.onore++;
////            this.ruolo.onore--;
////        }
////    }
////    public String toStringStatistiche(){
////        return nome +  " " + ruolo.nome +" " + resistenza+ "♥ " + ruolo.onore+"♣";
////    }
////    public String toString(){
////        String s="";
////        s+=nome +  " " + ruolo.nome +" " + resistenza+ "♥ " + ruolo.onore+"♣";
////        for(int j=0;j<mano.size();j++){
////            s+="\n\t"+mano.get(j).toString();
////        }
////        return s;
////    }
    
    public Ruolo getRuolo() {
        return ruolo;
    }

    public int getOnore() {
        return onore;
    }

    public int getResistenza() {
        return resistenza;
    }
    
    public boolean isAlive(){
        return resistenza > 0;
    }

    public void setRuolo(Ruolo ruolo) {
        this.ruolo = ruolo;
    }

    public void setOnore(int onore) {
        this.onore = onore;
    }

    public void setResistenza(int resistenza) {
        this.resistenza = resistenza;
    }

    public Personaggio getPersonaggio() {
        return personaggio;
    }

    public void setPersonaggio(Personaggio personaggio) {
        this.personaggio = personaggio;
    }
    
    private static final Logger LOG = Logger.getLogger(Giocatore.class.getName());
}
