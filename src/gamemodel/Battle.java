package gamemodel;

import org.jetbrains.annotations.Contract;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Battle {

    private ArrayList<Player> players = new ArrayList<>();
    private BattleType battleType;
    private Field field;
    private int turn = 0;


    @Contract("null, _ -> fail; !null, null -> fail")
    public Battle(BattleType battleType, Field field){
        if(battleType == null){
            throw new NullPointerException();
        }
        if(field == null){
            throw new NullPointerException();
        }
        this.field = field;
        this.battleType = battleType;
    }

    public void addPlayer(Player player){
        players.add(player);
    }

    public void advanceTurn(){
        System.out.println("Implement end of turn effects");
        for(Player player : players) {
            endTurnFor(player);
        }
        turn = turn + 1;
        for(Player player : players) {
            startTurnFor(player);
        }
    }

    private void startTurnFor(Player player) {
        try {
            player.draw();
            player.getManaPool().readyAll();
        } catch (Exception e) {
            Logger.getLogger(Battle.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private void endTurnFor(Player player) {
        System.out.println("Handle end of turn for each player");
    }



}
