import javafx.application.Application;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Start extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{

        Launchpad launchpad = new Launchpad(primaryStage);
        launchpad.loadBanks();
        launchpad.selectBank(0);
        launchpad.pressButton(0);   //play 1st
        launchpad.selectBank(1);
        launchpad.pressButton(1);    //play 4th
        launchpad.selectBank(1);
        launchpad.pressButton(0);    //play 3rd
        launchpad.getBanks()[0].loadButton(0);
        launchpad.selectBank(0);
        launchpad.pressButton(1);    //play 2nd
        launchpad.selectBank(0);
        launchpad.pressButton(0);   //play changed 1st

        System.exit(0);
    }

}
