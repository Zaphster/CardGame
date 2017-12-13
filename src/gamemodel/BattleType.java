package gamemodel;

import java.util.HashMap;

public class BattleType {
    private static HashMap<String, BattleType> allGameTypes = new HashMap<>();
    private static BattleType current;

    private BattleTypeSettings settings;


    public BattleType(){

    }

    public static BattleType getGameType(String name){
        return allGameTypes.get(name);
    }

    public static void setGameType(String name){
        current = allGameTypes.get(name);
    }

    public static BattleType getCurrent(){
        return current;
    }


}
