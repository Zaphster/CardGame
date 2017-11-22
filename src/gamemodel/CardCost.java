package gamemodel;

public abstract class CardCost {

    public enum TYPE{
        MANA,
        HEALTH,
        CARD_IN_HAND,
        CARD_IN_DECK,
    }

    public abstract CardCost clone();

    public abstract TYPE getType();

    public abstract void combineWith(CardCost toCombineWith) throws Exception;

}
