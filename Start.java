import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import sun.applet.Main;

import java.io.IOException;

public class Start extends Application {
    protected Launchpad launchpad;
    protected Stage primaryStage;

    @Override
    public void start(Stage primaryStage) throws Exception{
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Launchpad");
        showMainView();
    }

    public void showMainView() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("/start.fxml"));
        BorderPane mainLayout = loader.load();
        Scene scene = new Scene(mainLayout);
        scene.getStylesheets().add("/LaunchpadButton.css");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
