package gamemodel;

import java.util.ArrayList;

public class Card {
    private Card.TYPE type = TYPE.BASE;
    private ArrayList<CardCost> costs = new ArrayList<>();
    private ArrayList<Augment> augments;

    private int attack = 0;
    private int defense = 0;
    private int attackRange = 0;
    private int movementRange = 0;

    public enum TYPE{
        BASE,
        MINION,
        TECH,
        PLAYER
    }

    public Card(){
        augments = new ArrayList<>();
    }

    public Card.TYPE getType(){
        return type;
    }

    public void addAugment(Augment augment) throws Exception {
        if (augment == null) {
            throw new NullPointerException();
        }
        augments.add(augment);
        CardCost cost = augment.getCost();
        if(cost != null){
            costs.add(cost);
        }
    }

    public void removeAugment(Augment augment){
        augments.remove(augment);
        CardCost cost = augment.getCost();
        if(cost != null){
            costs.remove(cost);
        }
    }

    public ArrayList<CardCostMana> getManaCosts() {
        ArrayList<CardCostMana> manaCosts = new ArrayList<>();
        for(CardCost cost : costs){
            if(CardCostMana.class.isAssignableFrom(cost.getClass())){
                manaCosts.add((CardCostMana)cost);
            }
        }
        return CardCostMana.getCombinedManaCosts(manaCosts);
    }

    @Override
    public String toString(){
        return type.toString() + " card\n  Attack: ";
    }

}
