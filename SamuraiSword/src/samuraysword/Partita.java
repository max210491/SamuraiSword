/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samuraysword;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import samuraysword.carte.*;
import samuraysword.personaggi.*;

    
/**
 *
 * @author Mirko
 */
public class Partita {
    ArrayList<Carta> mazzo=new ArrayList<>();
    ArrayList<Carta> scarti=new ArrayList<>();
    ArrayList<Giocatore> giocatori=new ArrayList<>();
    Random random = new Random();
    int turno=0;
    public Partita(){
        preparativi();
        while(endgame()==false){
            JOptionPane.showMessageDialog(null,toStringTurno());
            giocatori.get(turno).turno(this);
            turno=(turno+1)%giocatori.size();
        }
        for(int i=0;i<giocatori.size();i++){
            System.out.println(giocatori.get(i).toStringStatistiche());
        }
    }
    public boolean endgame(){
        for(int i=0;i<giocatori.size();i++){
            if(giocatori.get(i).ruolo.onore<=0)
                return true;
        }
        return false;
    }
    public void preparativi(){
        for(int i=0;i<60;i++)
            mazzo.add(new Arma(""+i,i%10,i/10));
        ArrayList<Carta> temp1=new ArrayList<Carta>();
        temp1.add(new Ruolo("Shogun",5));
        temp1.add(new Ruolo("Samurai",4));
        temp1.add(new Ruolo("Samurai",4));
        temp1.add(new Ruolo("Ronin",4));
        temp1.add(new Ruolo("Ninja",4));
        temp1.add(new Ruolo("Ninja",4));
        ArrayList<Giocatore> temp2 = new ArrayList<Giocatore>();
        temp2.add(new Benkei());
        temp2.add(new Benkei());
        temp2.add(new Benkei());
        temp2.add(new Benkei());
        temp2.add(new Chiyome());
        temp2.add(new Chiyome());
        while(temp1.isEmpty()==false)
            giocatori.add(editGiocatore(temp1,temp2));
        for(int i=0;i<giocatori.size();i++)
            if(giocatori.get(i).ruolo.nome=="Shogun")
                turno=i;
        for(int i=0;i<giocatori.size();i++)
            giocatori.get((i+turno)%(giocatori.size())).pesca(this,4+((i+1)/2));
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
    public String toStringTurno(){
        //String s="/////////////////// Turno " + turno+ " /////////////////////////////\n";
        String s="Mazzo:"+mazzo.size()+" Scarti"+scarti.size()+"\n\n";
        for(int i=0;i<giocatori.size();i++){
            if (i==turno)
                s+=">>> ";
            s+=giocatori.get(i).toString()+"\n";
        }
        return s;
    }
}
