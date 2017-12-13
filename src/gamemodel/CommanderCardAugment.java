package gamemodel;

public class CommanderCardAugment extends Augment {
    private Augment.TYPE type = TYPE.PLAYER_CARD;

    public CommanderCardAugment() {

    }

    @Override
    public TYPE getType() {
        return TYPE.PLAYER_CARD;
    }
}
