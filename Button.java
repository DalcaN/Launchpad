import javafx.stage.Stage;

public class Button {
    private Sample sample;
    private Stage primaryStage;

    public Button(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public void loadSample() {
        sample = new Sample(primaryStage);
        System.out.println("Loaded: " + this);
    }

    public void press() {
        System.out.println("Playing: " + this);
        sample.play();
        System.out.println("Ending: " + this);
        sample.stop();
    }

    @Override
    public String toString() {
        String output = sample.getSource().toURI().toString();
        output = output.substring(6).replaceAll("%20", " ");

        return output;
    }
}
