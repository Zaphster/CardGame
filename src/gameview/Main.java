package gameview;

import javafx.application.Application;
import java.util.logging.Logger;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.AnchorPane;
import gamemodel.*;

import java.util.logging.Level;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = new AnchorPane();
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        try {
            CardCost oneWhiteCost = new CardCostMana(Mana.TYPE.WHITE, 1);
            StatAugment attackAugment = new StatAugment(oneWhiteCost);
            StatAugment defenseAugment = new StatAugment(oneWhiteCost);
            attackAugment.setAttackModifier(1);
            defenseAugment.setDefenseModifier(1);
            Card card = new Card();
            card.addAugment(attackAugment);
            card.addAugment(defenseAugment);
        } catch (Exception e){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
        }
        launch(args);
    }
}
