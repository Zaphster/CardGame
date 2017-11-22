package gamemodel;

public class StatAugment extends Augment {
    private int attackModifier = 0;
    private int defenseModifier = 0;
    private int attackRangeModifier = 0;
    private int movementRangeModifier = 0;

    public StatAugment(CardCost cost) throws Exception {
        this.setCost(cost.clone());
    }

    public void setAttackModifier(int attackModifier){
        this.attackModifier = attackModifier;
    }

    public void setDefenseModifier(int defenseModifier){
        this.defenseModifier = defenseModifier;
    }

    public void setAttackRangeModifier(int attackRangeModifier){
        this.attackRangeModifier = attackRangeModifier;
    }

    public void setMovementRangeModifier(int movementRangeModifier){
        this.movementRangeModifier = movementRangeModifier;
    }

    public int getAttackModifier(){
        return attackModifier;
    }

    public int getDefenseModifier(){
        return defenseModifier;
    }

    public int getAttackRangeModifier(){
        return attackRangeModifier;
    }

    public int getMovementRangeModifier(){
        return movementRangeModifier;
    }

    @Override
    public Augment.TYPE getType(){
        return TYPE.STAT;
    }
}
