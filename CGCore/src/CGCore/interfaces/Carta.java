package CGCore.interfaces;

/**
 * Classe generica per la gestione delle carte
 *
 * @author Mirko
 */
public interface Carta {

    /**
     * Restituisce la tipologia della carta. Spesso la tipologia di una carta
     * viene passata nel costruttore e non è modificabile.
     *
     * @return Tipologia della carta.
     */
    public TipoCarta getTipo();

    /**
     * Restituisce il nome della carta
     *
     * @return String contenente il nome della carta.
     */
    public String getName();
}
