package gamemodel;

import java.util.HashMap;

public class Minion {
//    private static int nextId = 0;
//    private static HashMap<Integer, Minion> minions = new HashMap<>();

    private Integer id;
    private int attack = 0;
    private int defense = 0;
    private int attackRange = 0;
    private int movementRange = 0;

//    private static int getNextId(){
//        nextId = nextId + 1;
//        return nextId;
//    }

    public Minion(){
//        this.id = getNextId();
    }

    public void setAttack(int attack){
        this.attack = attack;
    }

    public int getAttack(){
        return attack;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getDefense(){
        return defense;
    }

    public void setAttackRange(int attackRange) {
        this.attackRange = attackRange;
    }

    public int getAttackRange(){
        return attackRange;
    }

    public void setMovementRange(int movementRange) {
        this.movementRange = movementRange;
    }

    public int getMovementRange(){
        return movementRange;
    }
}
