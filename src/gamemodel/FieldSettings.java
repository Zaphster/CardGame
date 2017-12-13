package gamemodel;

import java.awt.*;

public class FieldSettings {
    private int[][] fieldLayout = Default.FIELD_LAYOUT;
    private Point startPosition_player1;
    private Point startPosition_player2;

    public FieldSettings() {

    }

    public void setFieldLayout(int[][] layout) {
        this.fieldLayout = layout;
    }

    public int[][] getFieldLayout() {
        return fieldLayout;
    }

    public void setStartPosition_player1(Point position) {
        startPosition_player1 = position;
    }

    public void setStartPosition_player2(Point position) {
        startPosition_player2 = position;
    }

    public Point getStartPosition_player1() {
        return startPosition_player1;
    }

    public Point getStartPosition_player2() {
        return startPosition_player2;
    }
}
