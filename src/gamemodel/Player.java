package gamemodel;

import java.util.ArrayList;

public class Player {
    private final ManaPool manaPool;
    private final Deck deck;
    private final Hand hand;


    public Player(Deck deck){
        if(deck == null){
            throw new NullPointerException();
        }
        manaPool = new ManaPool();
        hand = new Hand();
        this.deck = deck;
    }

    public void setDeck(Deck deck){
        deck = deck;
    }

    public void draw() throws Exception {
        if(deck != null){
            hand.addCard(deck.draw());
        } else {
            throw new NullPointerException();
        }
    }

    public Hand getHand(){
        return hand;
    }

    public ManaPool getManaPool(){
        return manaPool;
    }

    public Deck getDeck(){
        return deck;
    }

}
