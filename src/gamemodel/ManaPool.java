package gamemodel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class ManaPool {
    private HashMap<Mana.TYPE, ArrayList<Mana>> mana = new HashMap<>();

    public ManaPool() {
        for(Mana.TYPE type : Mana.TYPE.values()){
            mana.put(type, new ArrayList<>());
        }
    }

    public synchronized Boolean haveAvailable(Mana.TYPE type, int amount){
        return amount <= availableAmountOfType(type);
    }

    private synchronized int availableAmountOfType(Mana.TYPE type) {
        ArrayList<Mana> manaOfType = mana.get(type);
        if (manaOfType != null) {
            int amount = 0;
            for (Mana mana : manaOfType) {
                if (mana.canUse()) {
                    amount += 1;
                }
            }
            return amount;
        }
        return 0;
    }

    public synchronized Boolean use(Mana.TYPE type, int amount){
        if (!haveAvailable(type, amount)) {
            return false;
        }
        ArrayList<Mana> manaOfType = mana.get(type);
        if (manaOfType == null) {
            return false;
        }
        while (amount > 0) {
            Mana mana = getNextAvailableManaOfType(type);
            if(mana != null) {
                mana.use();
            }
        }
        return true;
    }

    private synchronized Mana getNextAvailableManaOfType(Mana.TYPE type){
        ArrayList<Mana> manaOfType = mana.get(type);
        if(manaOfType != null){
            for(Mana mana : manaOfType){
                if(mana.canUse()){
                    return mana;
                }
            }
        }
        return null;
    }

    public synchronized void clear(){
        mana.clear();
    }

    public synchronized void readyAll(){
        for(Entry<Mana.TYPE, ArrayList<Mana>> entry : mana.entrySet()){
            for(Mana mana : entry.getValue()){
                mana.reset();
            }
        }
    }

    public synchronized void addManaOfType(Mana.TYPE type){
        Mana mana = new Mana(type);

    }
}
