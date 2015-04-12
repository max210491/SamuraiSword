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
            if(p.mazzo.size()==0){
                p.mazzo=p.scarti;
                p.scarti=new ArrayList<Carta>();
                for(int j=0;j<p.giocatori.size();j++)
                    p.giocatori.get(j).ruolo.onore--;
            }
            else{
                int rnd=random.nextInt(p.mazzo.size());
                mano.add(p.mazzo.get(rnd));
                p.mazzo.remove(rnd);
            }
        }
    }
    public void turno(Partita p){
        if(resistenza <=0)
            resistenza=resistenzaMax;
        pesca(p,2);
        //equippa
        //gialle
        attacca(p,p.giocatori.get((p.turno+1)%p.giocatori.size()),(Arma)mano.get(0));
        while(mano.size()>7)
            mano.remove(0);
    }
    public void attacca(Partita p,Giocatore g,Arma a){
        g.mano.remove(a);
        p.scarti.add(a);
        //se lo raggiunge e non para
        g.danno(this,a);
    }
    public void danno(Giocatore g,Arma a){
        resistenza-=a.danno;
        if(resistenza<=0){
            g.ruolo.onore++;
            this.ruolo.onore--;
        }
    }
    public String toStringStatistiche(){
        return nome +  " " + ruolo.nome +" " + resistenza+ "♥ " + ruolo.onore+"♣";
    }
    public String toString(){
        String s="";
        s+=nome +  " " + ruolo.nome +" " + resistenza+ "♥ " + ruolo.onore+"♣";
        for(int j=0;j<mano.size();j++){
            s+="\n\t"+mano.get(j).toString();
        }
        return s;
    }
    private static final Logger LOG = Logger.getLogger(Giocatore.class.getName());
}
