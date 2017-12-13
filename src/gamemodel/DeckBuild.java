package gamemodel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DeckBuild {
    private static final String DECK_FULL = "Deck is full";
    private static final String CARD_NOT_FOUND_IN_DECK = "Card is not in the deck";
    private final ArrayList<Card> cards;
    private DeckSettings deckSettings;
    private Boolean isValid = false;

    public DeckBuild(){
        deckSettings = Default.DECK_SETTINGS;
        cards = new ArrayList<>();
    }

    public void setDeckSettings(DeckSettings deckSettings){
        this.deckSettings = deckSettings;
        revalidate();
    }

    public synchronized void addCard_build(Card card) throws Exception {
        if (card == null) {
            throw new NullPointerException();
        }
        if (cards.size() >= deckSettings.getMaxDeckBuildSize()) {
            throw new Exception(DECK_FULL);
        }
        cards.add(card);
        revalidate();
    }

    public synchronized void clear(){
        cards.clear();
        revalidate();
    }

    public synchronized void addCards(Collection<Card> cardCollection) throws Exception {
        if(cardCollection == null){
            throw new NullPointerException();
        }
        cards.addAll(cardCollection);
        revalidate();
    }

    public synchronized int getIndexOf(Card card) throws Exception {
        if(cards.contains(card)){
            return cards.indexOf(card);
        } else {
            throw new Exception(CARD_NOT_FOUND_IN_DECK);
        }
    }

    public synchronized void addCards(ArrayList<Card> cardList) throws Exception {
        if(cardList == null){
            throw new NullPointerException();
        }
        cards.addAll(cardList);
        revalidate();
    }

    public synchronized Card removeCard(Card card) throws Exception {
        if(!cards.contains(card)){
            throw new Exception(CARD_NOT_FOUND_IN_DECK);
        }
        cards.remove(card);
        revalidate();
        return card;
    }

    public synchronized Card removeCardAt(int index) throws Exception {
        if(index < 0 || index >= cards.size()){
            throw new IndexOutOfBoundsException();
        }
        revalidate();
        return cards.remove(index);
    }

    private void revalidate() {
        isValid = false;
        int cardCount = 0;
        int commanderCount = 0;
        for(Card card : cards) {
            if(card.getType() == Card.TYPE.COMMANDER) {
                commanderCount++;
            }
            cardCount++;
        }
        isValid = (cardCount == deckSettings.getMaxDeckBuildSize()) && (commanderCount == deckSettings.getMaxNumCommanders());
    }

    public DeckSettings getDeckSettings() {
        return this.deckSettings;
    }

    public synchronized ArrayList<Card> getCards() {
        return this.cards;
    }
}
