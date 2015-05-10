package CGCore.interfaces;

/**
 * Tipologia di carte utilizzate nel gioco
 *
 * @author Simone
 */
public interface TipoCarta {

    /**
     * Restituisce in forma leggibile il nome della tipologia di carta. Esempio:
     * 'Azione', 'Attacco' ecc
     *
     * @return String contenente il nome della tipologia in forma leggibile.
     */
    public String getNomeTipo();

    /**
     * Restituisce il tipo della carta. Per tipo si intende una String
     * contenente un nome univoco utilizzato per identificare la tipologia. Il
     * tipo può essere formato da qualsiasi sequenza di lettere e numeri.
     *
     * @return String contenente l'identificatore univoco del tipo.
     */
    public String getTipo();

    /**
     * Indica se la tipologia di carte è abilitata o meno al gioco. Le carte di
     * tipologie abilitate al gioco verranno "mescolate" e inserite nel mazzo
     * durante la partita. Le carte non abilitate al gioco sono carte con
     * effetti particolari esterni al turno di gioco e che verranno utilizzate
     * in tutti gli altri momenti diversi dallo svolgimento regolare di un
     * turno: esempio sono carte che indicano "ruoli" (spesso fise durante tutta
     * la partita).
     *
     * @return
     */
    public boolean abilitatoAlGioco();
}
