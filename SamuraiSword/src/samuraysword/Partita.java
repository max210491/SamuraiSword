/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samuraysword;

import java.util.ArrayList;
import java.util.Random;
import samuraysword.carte.*;
import samuraysword.personaggi.*;

    
/**
 *
 * @author Mirko
 */
public class Partita {
    ArrayList<Carta> mazzo=new ArrayList<Carta>();
    ArrayList<Carta> scarti=new ArrayList<Carta>();
    ArrayList<Giocatore> giocatori=new ArrayList<Giocatore>();
    Random random = new Random();
    int turno=0;
    public Partita(){
        preparativi();
        for(int i=0;i<giocatori.size();i++){
            Giocatore t=giocatori.get(i);
            System.out.println(t.nome +  " " + t.ruolo.nome +" " + t.resistenza+ "♥ " + t.ruolo.onore+"♣");
            for(int j=0;j<t.mano.size();j++){
                System.out.println("\t"+t.mano.get(j).nome);
            }
        }
    }
    public void preparativi(){
        for(int i=0;i<60;i++)
            mazzo.add(new Carta(""+i));
        ArrayList<Carta> temp1=new ArrayList<Carta>();
        temp1.add(new Ruolo("Shogun",5));
        temp1.add(new Ruolo("Samurai",3));
        temp1.add(new Ruolo("Samurai",3));
        temp1.add(new Ruolo("Ronin",3));
        temp1.add(new Ruolo("Ninja",3));
        temp1.add(new Ruolo("Ninja",3));
        
        ArrayList<Giocatore> temp2 = new ArrayList<Giocatore>();
        temp2.add(new Benkei());
        temp2.add(new Benkei());
        temp2.add(new Benkei());
        temp2.add(new Benkei());
        temp2.add(new Chiyome());
        temp2.add(new Chiyome());
        while(temp1.isEmpty()==false){
            giocatori.add(editGiocatore(temp1,temp2));
        }
        for(int i=0;i<giocatori.size();i++){
            if(giocatori.get(i).ruolo.nome=="Shogun")
                turno=i;
        }
        for(int i=0;i<giocatori.size();i++){
            for(int j=0;j<5;j++){
                int rnd=random.nextInt(mazzo.size());
                Carta t = mazzo.get(rnd);
                mazzo.remove(rnd);
                giocatori.get(i).mano.add(t);
            }
        }
    }
    public Giocatore editGiocatore(ArrayList<Carta> temp1,ArrayList<Giocatore> temp2){
        int rnd1=random.nextInt(temp1.size());
        int rnd2=random.nextInt(temp2.size());
        Giocatore temp=temp2.get(rnd2);
        temp2.remove(rnd2);
        temp.ruolo=(Ruolo) temp1.get(rnd1);
        temp1.remove(rnd1);
        return temp;
    }
}
