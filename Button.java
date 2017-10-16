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
        sample.play();
    }

    @Override
    public String toString() {
        String output = sample.getSource().toURI().toString();
        int index = output.lastIndexOf('/');
        output = output.substring(index + 1).replaceAll("%20", " ");
        return output;
    }
}
