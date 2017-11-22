package gamemodel;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Battle {

    private ArrayList<Player> players = new ArrayList();
    private GameType gameType;
    private int turn = 0;


    public Battle(GameType gameType){
        if(gameType == null){
            throw new NullPointerException();
        }
        this.gameType = gameType;
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
