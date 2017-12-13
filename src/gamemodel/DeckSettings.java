package gamemodel;

public class DeckSettings {
    private String name;
    private int maxDeckBuildSize;
    private int maxDeckPlaySize;
    private int maxNumCommanders;

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

    public void setMaxNumCommanders(int numCommanders) { this.maxNumCommanders = numCommanders; }

    public int getMaxNumCommanders() { return this.maxNumCommanders; }

}
