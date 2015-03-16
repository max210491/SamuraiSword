/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package samuraysword.partita;

import samuraysword.Partita;

/**
 * Questa classe rappresenta le skill dei personaggi (non l'ho chiamata skill
 * perchè sarebbe fuorviante. L'idae è di suddividere le abilità sulla base
 * dell'evento che le scatena. La partita, dopo aver assegnato i giocatori e 
 * prima di iniziare registra le ComplexAction dei player nella giusta sezione.
 * Quando si verifica l'evento corrispondente esegue il metodo exec che esegue
 * la callback presente nelle relative carte. In questo modo le abilità rimangono
 * nelle rispettive classi e restano disaccoppiate da tutto il resto (volendo si
 * possono rimuovere carte dal gioco e questo funziona comunque).
 * @author Simo
 */
public class ComplexAction {
    
    /**
     * Tipi di azioni registrabili, spstituire "ECC" con tutte le azioni possibili a cui
     * è concesso "agganciare" un evento di qualche carta.
     */
    public static enum tipoAzione {FERITA_SUBITA, FERITA_ARRECATA, PESCA_CARTA, ATTACCO, AZIONE, ECC};
    
    private tipoAzione tipo;
    
    private SkillCallback back;

    public ComplexAction(SkillCallback back) {
        this.tipo = back.getTipoCall();
        this.back = back;
    }
    
    public void execute(Partita p){
        back.runCallback(p);
    }

    public tipoAzione getTipo() {
        return tipo;
    }
    
    
    
}
