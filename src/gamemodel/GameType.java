package gamemodel;

import java.util.HashMap;

public class GameType {
    private static HashMap<String, GameType> allGameTypes = new HashMap<>();
    private static GameType current;

    private GameTypeSettings settings;


    public GameType(){

    }

    public static GameType getGameType(String name){
        return allGameTypes.get(name);
    }

    public static void setGameType(String name){
        current = allGameTypes.get(name);
    }

    public static GameType getCurrent(){
        return current;
    }


}
