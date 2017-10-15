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
//        Scanner scanner = new Scanner(System.in);
//        int option;
//
//        Bank bank1 = new Bank(primaryStage);
//        bank1.loadButtons();
//
//        System.out.println("Choose a button to press: ");
//        for(int i = 0; i < bank1.getButtons().length; i++) {
//            System.out.println((i + 1) + ") " + bank1.getButton(i).toString());
//        }
//        option = scanner.nextInt() - 1;
//
//        if(option >= 0 && option <= bank1.getButtons().length) {
//            bank1.getButton(option).press();
//        } else {
//            System.out.println("Not in the correct range sorry!");
//        }


//        for(int i = 0; i < bank1.getButtons().length; i++) {
//            bank1.getButton(i).press();
//        }

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
