package gamemodel;

public class Mana {

    public enum TYPE {
        GREEN,
        RED,
        GREY,
        BLUE,
        WHITE
    }

    private Boolean used = false;
    private TYPE type;


    public Mana(TYPE type){
        this.type = type;
    }

    public Boolean use(){
        if(canUse()){
            used = true;
            return true;
        } else {
            return false;
        }
    }

    public void reset(){
        used = false;
    }

    public Boolean canUse(){
        return !used;
    }

    public Boolean isUsed(){
        return used;
    }
}
