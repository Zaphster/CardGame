package gamemodel;

import java.awt.*;

public class Default {

    //used to store settings through the entire game, independent of game type

    public static final int MAX_CHARACTER_MANA = 100;
    public static final int MAX_DECK_BUILD_SIZE = 45;
    public static final int MAX_DECK_PLAY_SIZE = 100;
    public static final int MAX_NUM_COMMANDERS_IN_DECK = 1;
    public static final int[][] FIELD_LAYOUT;
    public static final FieldSettings FIELD_SETTINGS;
    public static final Point START_POSITION_PLAYER_1 = new Point(5, 1);
    public static final Point START_POSITION_PLAYER_2 = new Point(5, 6);

    public static final DeckSettings DECK_SETTINGS = new DeckSettings();

    static{
        DECK_SETTINGS.setName("Default");
        DECK_SETTINGS.setMaxDeckBuildSize(MAX_DECK_BUILD_SIZE);
        DECK_SETTINGS.setMaxDeckPlaySize(MAX_DECK_PLAY_SIZE);
        DECK_SETTINGS.setMaxNumCommanders(MAX_NUM_COMMANDERS_IN_DECK);

        FIELD_LAYOUT = new int[][]{
                {0, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1},
                {0, 1, 1, 1, 1},
        };

        FIELD_SETTINGS = new FieldSettings();
        FIELD_SETTINGS.setFieldLayout(FIELD_LAYOUT);
        FIELD_SETTINGS.setStartPosition_player1(START_POSITION_PLAYER_1);
        FIELD_SETTINGS.setStartPosition_player2(START_POSITION_PLAYER_2);

        //      *   *   *   *
        //    *   *   *   *   *
        //  *   *   *   *   *   *
        //    *   *   *   *   *
        //  *   *   *   *   *   *
        //    *   *   *   *   *
        //  *   *   *   *   *   *
        //    *   *   *   *   *
        //      *   *   *   *
    }

}
