import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;

public class Start extends Application {
    protected Launchpad launchpad;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("start.fxml"));

        Scene scene = new Scene(root);

        launchpad = new Launchpad(primaryStage);
        launchpad.loadBanks();

        StartController controller = new StartController();

        primaryStage.setTitle("Launchpad");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

}
