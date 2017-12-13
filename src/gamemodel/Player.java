package gamemodel;

public class Player {
    private final ManaPool manaPool;
    private final DeckBuild deckBuild;
    private final DeckPlay deckPlay = null;
    private final Hand hand;


    public Player(DeckBuild deckBuild){
        if(deckBuild == null){
            throw new NullPointerException();
        }
        manaPool = new ManaPool();
        hand = new Hand();
        this.deckBuild = deckBuild;
    }

    public void setDeckBuild(DeckBuild deckBuild){
        deckBuild = deckBuild;
    }

    public void readyDeckForPlay() throws Exception{
        deckPlay.addCards(deckBuild.getCards());
    }

    public void draw() throws Exception {
        if(deckPlay != null){
            hand.addCard(deckPlay.draw());
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

    public DeckBuild getDeckBuild(){
        return deckBuild;
    }

}
