package gamemodel;

public abstract class Augment {
    private CardCost cost;

    public enum TYPE{
        STAT(StatAugment.class),
        PLAYER_CARD(CommanderCardAugment.class);

        public Class<?> associatedClass;

        TYPE(Class<?> clazz){
            this.associatedClass = clazz;
        }
    }

    public Augment(){

    }

    public void setCost(CardCost cost){
        if(cost == null){
            throw new NullPointerException();
        }
        this.cost = cost.clone();
    }

    public CardCost getCost(){
        return cost;
    }

    public abstract Augment.TYPE getType();

}
