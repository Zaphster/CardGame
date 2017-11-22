package gamemodel;

public enum Race {
    GREEN(Mana.TYPE.GREEN),
    RED(Mana.TYPE.RED),
    BLUE(Mana.TYPE.BLUE),
    GREY(Mana.TYPE.GREY),
    WHITE(Mana.TYPE.WHITE);

    Mana.TYPE manaType;

    Race(Mana.TYPE type){
        this.manaType = type;
    }
}
