/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CGCore;

import CGCore.interfaces.Carta;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Simo
 */
public class Player {

    private final String name;
    private List<Carta> cards = new ArrayList<>();

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Carta> getCards() {
        return cards;
    }

    public void addCard(Carta c) {
        cards.add(c);
    }

    public void addCards(List<Carta> l) {
        for (Carta c : l) {
            addCard(c);
        }
    }

    public boolean removeCard(Carta c) {
        return cards.remove(c);
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Player ? name.equals(((Player) o).name) : false;
    }
}
