package gamemodel;

public class DeckSettings {
    private String name;
    private int maxDeckBuildSize = GameSettings.DEFAULT_MAX_DECK_BUILD_SIZE;
    private int maxDeckPlaySize = GameSettings.DEFAULT_MAX_DECK_PLAY_SIZE;

    public Boolean usesPlayerCard = true;

    public DeckSettings(){

    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setMaxDeckBuildSize(int size){
        this.maxDeckBuildSize = size;
    }

    public int getMaxDeckBuildSize(){
        return this.maxDeckBuildSize;
    }

    public void setMaxDeckPlaySize(int size){
        this.maxDeckPlaySize = size;
    }

    public int getMaxDeckPlaySize(){
        return this.maxDeckPlaySize;
    }

}
