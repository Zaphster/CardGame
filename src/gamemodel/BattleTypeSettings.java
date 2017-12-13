package gamemodel;

import java.util.EventListener;

public class BattleTypeSettings {

    //used to store settings that are dependent on which game type is being played
    private int maxCharacterMana = Default.MAX_CHARACTER_MANA;
    private int maxDeckBuildSize = Default.MAX_DECK_BUILD_SIZE;
    private int maxDeckPlaySize = Default.MAX_DECK_PLAY_SIZE;

    private EventListener onTurnStart;
    private EventListener onTurnEnd;
    private EventListener onCardPlay;
    private EventListener onCardDraw;
    private EventListener onCardDiscard;
    private EventListener onMinionAttack;
    private EventListener onMinionDefend;
    private EventListener onMinionLeaveSpace;
    private EventListener onMinionEnterSpace;
    private EventListener onMinionDealDamage;
    private EventListener onMinionTakeDamage;
    private EventListener onMinionUseAbility;
    private EventListener onMinionDeath;
    private EventListener onManaUse;
    private EventListener onManaRefresh;
    private EventListener onManaGainNew;

    public BattleTypeSettings(){

    }

    public void setMaxCharacterMana(int maxCharacterMana) {
        this.maxCharacterMana = maxCharacterMana;
    }

    public void setMaxDeckBuildSize(int maxDeckBuildSize) {
        this.maxDeckBuildSize = maxDeckBuildSize;
    }

    public void setMaxDeckPlaySize(int maxDeckPlaySize) {
        this.maxDeckPlaySize = maxDeckPlaySize;
    }

    public void setOnCardPlay(EventListener onCardPlay) {
        this.onCardPlay = onCardPlay;
    }

    public void setOnCardDraw(EventListener onCardDraw) {
        this.onCardDraw = onCardDraw;
    }

    public void setOnCardDiscard(EventListener onCardDiscard) {
        this.onCardDiscard = onCardDiscard;
    }

    public void setOnMinionAttack(EventListener onMinionAttack) {
        this.onMinionAttack = onMinionAttack;
    }

    public void setOnMinionDefend(EventListener onMinionDefend) {
        this.onMinionDefend = onMinionDefend;
    }

    public void setOnMinionLeaveSpace(EventListener onMinionLeaveSpace) {
        this.onMinionLeaveSpace = onMinionLeaveSpace;
    }

    public void setOnMinionEnterSpace(EventListener onMinionEnterSpace) {
        this.onMinionEnterSpace = onMinionEnterSpace;
    }

    public void setOnMinionDealDamage(EventListener onMinionDealDamage) {
        this.onMinionDealDamage = onMinionDealDamage;
    }

    public void setOnMinionTakeDamage(EventListener onMinionTakeDamage) {
        this.onMinionTakeDamage = onMinionTakeDamage;
    }

    public void setOnMinionUseAbility(EventListener onMinionUseAbility) {
        this.onMinionUseAbility = onMinionUseAbility;
    }

    public void setOnMinionDeath(EventListener onMinionDeath) {
        this.onMinionDeath = onMinionDeath;
    }

    public void setOnManaUse(EventListener onManaUse) {
        this.onManaUse = onManaUse;
    }

    public void setOnManaRefresh(EventListener onManaRefresh) {
        this.onManaRefresh = onManaRefresh;
    }

    public void setOnManaGainNew(EventListener onManaGainNew) {
        this.onManaGainNew = onManaGainNew;
    }

    public void setOnTurnStart(EventListener onTurnStart) {
        this.onTurnStart = onTurnStart;
    }

    public void setOnTurnEnd(EventListener onTurnEnd) {
        this.onTurnEnd = onTurnEnd;
    }
}
