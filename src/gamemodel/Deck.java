package gamemodel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Deck {
    private final ArrayList<Card> cards;
    private DeckSettings deckSettings;

    public Deck(){
        cards = new ArrayList<>();
    }

    public void setDeckSettings(DeckSettings deckSettings){
        this.deckSettings = deckSettings;
    }

    public synchronized void addCard(Card card) throws Exception {
        if (card == null) {
            throw new NullPointerException();
        }
        cards.add(card);
    }

    public synchronized void clear(){
        cards.clear();
    }

    public synchronized void addCardAtIndex(Card card, int index) throws Exception {
        if (card == null) {
            throw new NullPointerException();
        }
        cards.add(index, card);
    }

    public synchronized void addCardToTop(Card card) throws Exception {
        if (card == null) {
            throw new NullPointerException();
        }
        cards.add(0, card);
    }

    public synchronized void addCardAtRandom(Card card) throws Exception {
        if (card == null) {
            throw new NullPointerException();
        }
        int randomIndex = (int) (Math.random() * cards.size());
        cards.add(randomIndex, card);
    }

    public synchronized void addCards(Collection<Card> cardCollection) throws Exception {
        if(cardCollection == null){
            throw new NullPointerException();
        }
        cards.addAll(cardCollection);
    }

    public synchronized int getIndexOf(Card card) throws Exception {
        if(cards.contains(card)){
            return cards.indexOf(card);
        } else {
            throw new Exception("Card not found in deck");
        }
    }

    public synchronized void addCards(ArrayList<Card> cardList) throws Exception {
        if(cardList == null){
            throw new NullPointerException();
        }
        cards.addAll(cardList);
    }

    public Card draw() throws Exception {
        return removeCardAt(0);
    }

    public synchronized void shuffle() throws Exception {
        ArrayList<Card> toShuffle = new ArrayList(cards);
        ArrayList<Card> shuffled = new ArrayList();
        while (shuffled.size() != cards.size()) {
            int index = (int)(Math.random() * (double)toShuffle.size());
            Card card = toShuffle.remove(index);
            shuffled.add(card);
        }
        if(cards.size() == shuffled.size()) {
            cards.clear();
            cards.addAll(shuffled);
        } else {
            throw new Exception("Deck shuffling error.  Shuffled count is not equal to original deck count.");
        }
    }

    public synchronized Card removeCard(Card card) throws Exception {
        if(!cards.contains(card)){
            throw new Exception("Card not found in deck");
        }
        cards.remove(card);
        return card;
    }

    public synchronized Card removeCardAt(int index) throws Exception {
        if(index < 0 || index >= cards.size()){
            throw new IndexOutOfBoundsException();
        }
        return cards.remove(index);
    }

    public synchronized void putCardFromDeckToTop(Card card) throws Exception {
        int index = -1;
        try {
            index = getIndexOf(card);
            this.removeCard(card);
        } catch (Exception e) {
            Logger.getLogger(Deck.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            this.addCardToTop(card);
        } catch (Exception e) {
            Logger.getLogger(Deck.class.getName()).log(Level.SEVERE, null, e);
            this.addCardAtIndex(card, index);
        }
    }

    public synchronized void putCardFromDeckByIndexToTop(int index) throws Exception {
        Card card = null;
        try {
            card = this.removeCardAt(index);
        } catch (Exception e){
            Logger.getLogger(Deck.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            this.addCardToTop(card);
        } catch (Exception e) {
            Logger.getLogger(Deck.class.getName()).log(Level.SEVERE, null, e);
            this.addCardAtIndex(card, index);
        }
    }

    public synchronized void putCardFromDeckToBottom(Card card) throws Exception {
        int index = -1;
        try {
            index = this.getIndexOf(card);
            this.removeCard(card);
        } catch (Exception e) {
            Logger.getLogger(Deck.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            this.addCardToBottom(card);
        } catch (Exception e) {
            Logger.getLogger(Deck.class.getName()).log(Level.SEVERE, null, e);
            this.addCardAtIndex(card, index);
        }
    }

    public synchronized void addCardToBottom(Card card) throws Exception {
        addCard(card);
    }
}
