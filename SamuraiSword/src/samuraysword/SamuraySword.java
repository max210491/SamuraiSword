/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samuraysword;

import CGCore.CGCore;
import CGCore.CardManager;
import CGCore.Game;
import CGCore.Player;
import CGCore.interfaces.TipoCarta;
import java.util.logging.Logger;
import samuraysword.carte.personaggio.Benkei;
import samuraysword.carte.personaggio.Chiyome;
import samuraysword.carte.personaggio.Kojiro;
import samuraysword.carte.ruolo.Ronin;
import samuraysword.partita.FasePesca;
import samuraysword.partita.Giocatore;

/**
 *
 * @author Mirko
 */
public class SamuraySword {
    public static void main(String[] args) {
        //Partita p=new Partita();
     //carica mazzo
     //mischia
     //
        
        //creo un nuovo CGCore (o mi prendo quello già esistente).
        CGCore core = CGCore.getCGCore();
        
        //creo le tipologie di carte.
        TipoCarta ARMA = new TipoCarta("Arma");
        TipoCarta AZIONE = new TipoCarta("Azione");
        TipoCarta PERSONAGGIO = new TipoCarta("Personaggio");
        TipoCarta PROPRIETA = new TipoCarta("Proprieta");
        TipoCarta RUOLO = new TipoCarta("Ruolo", false);
        
        //aggiungo le tipologie.
        CardManager cardMan = core.getCardManager();
        cardMan.registerTipoCarta(ARMA);
        cardMan.registerTipoCarta(AZIONE);
        cardMan.registerTipoCarta(PERSONAGGIO);
        cardMan.registerTipoCarta(PROPRIETA);
        cardMan.registerTipoCarta(RUOLO);
        
        //aggiungo le carte
        cardMan.addCard(new Ronin(RUOLO), 1);
        cardMan.addCard(new Benkei(PERSONAGGIO), 1);
        cardMan.addCard(new Chiyome(PERSONAGGIO), 1);
        cardMan.addCard(new Kojiro(PERSONAGGIO), 1);
        
        //creo le fasi di gioco e le aggiungo nell'ordine di esecuzione
        Game g = core.getGame();
        g.addPhase(new FasePesca());
        
        //avvio il core -> inizializzazione del motore utilizzando le cose aggiunte
        core.init();  
        
        //se tutto ok imposto il numero di giocatori
        Giocatore p1 = new Giocatore("Player1");
        g.addPlayer(p1);
        
        //avvio il gioco
        
        
    }
    private static final Logger LOG = Logger.getLogger(SamuraySword.class.getName());
}
