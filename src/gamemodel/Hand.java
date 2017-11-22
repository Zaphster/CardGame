package gamemodel;

import java.util.ArrayList;
import java.util.Collection;

public class Hand {
    private ArrayList<Card> cards = new ArrayList<>();

    public Hand(){

    }

    public Hand(Collection<Card> initialCards) {
        cards.addAll(initialCards);
    }

    public Hand(ArrayList<Card> initialCards) {
        cards.addAll(initialCards);
    }

    public synchronized void addCard(Card card) {
        cards.add(card);
    }

    public synchronized Card removeCard(Card card) {
        if(cards.remove(card)){
            return card;
        }
        return null;
    }

    public synchronized Card removeCardAtIndex(int index) {
        if(index >= 0 && index < cards.size()){
            return cards.remove(index);
        }
        return null;
    }

    public Card viewCardAtIndex(int index) {
        return cards.get(index);
    }

    public void clear(){
        cards.clear();
    }

}
