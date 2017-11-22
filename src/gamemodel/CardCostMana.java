package gamemodel;

import java.util.Collection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CardCostMana extends CardCost {

    private Mana.TYPE manaType;
    private int amount;
    private int discount = 0;

    public CardCostMana (Mana.TYPE manaType, int amount) {
        if(amount < 0){
            amount = 0;
        }
        this.manaType = manaType;
        this.amount = amount;
    }

    public CardCostMana(int zero) throws Exception{
        if(zero != 0){
            throw new Exception("Amount only initializer is only valid for zero cost");
        }
        this.amount = zero;
    }

    public static ArrayList<CardCostMana> getCombinedManaCosts(Collection<CardCostMana> costs){
        HashMap<Mana.TYPE, CardCostMana> costsByMana = new HashMap<>();
        ArrayList<CardCostMana> combinedCosts = new ArrayList<>();
        costs.forEach((cost) -> {
            Mana.TYPE type = cost.getManaType();
            CardCostMana previousCostOfType = costsByMana.get(type);
            if(previousCostOfType == null){
                previousCostOfType = (CardCostMana)cost.clone();
            } else {
                previousCostOfType.combineWith(cost);
            }
            costsByMana.put(cost.getManaType(), previousCostOfType);
        });
        for(Entry<Mana.TYPE, CardCostMana> entry : costsByMana.entrySet()){
            combinedCosts.add(entry.getValue());
        }
        return combinedCosts;
    }

    public Mana.TYPE getManaType() {
        return this.manaType;
    }

    public int getDiscountedAmount() {
        return Math.max(amount - discount, 0);
    }

    public int getFullAmount() {
        return amount;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discountAmount){
        discount = discountAmount;
    }
    public void setAmount(int amount) { this.amount = amount; }

    @Override
    public CardCost clone() {
        CardCostMana cost = new CardCostMana(this.manaType, this.amount);
        cost.setDiscount(this.discount);
        return cost;
    }

    @Override
    public void combineWith(CardCost toCombineWith) {
        if(!CardCostMana.class.isAssignableFrom(toCombineWith.getClass())){
            Logger.getLogger(CardCostMana.class.getName()).log(Level.SEVERE,"Cannot combine CardCostMana with " + toCombineWith.getClass());
        }
        setAmount(amount + ((CardCostMana) toCombineWith).getFullAmount());
        setDiscount(getDiscount() + ((CardCostMana) toCombineWith).getDiscount());
    }

    @Override
    public CardCost.TYPE getType(){
        return TYPE.MANA;
    }
}
