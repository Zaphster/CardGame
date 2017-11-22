package gamemodel;

public class PlayerCardAugment extends Augment {
    private Augment.TYPE type = TYPE.PLAYER_CARD;

    public PlayerCardAugment() {

    }

    @Override
    public TYPE getType() {
        return TYPE.PLAYER_CARD;
    }
}
