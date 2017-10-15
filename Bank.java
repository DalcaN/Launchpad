import javafx.stage.Stage;

public class Bank {
    private Button[] buttons;
    private Stage primaryStage;

    public Bank(Stage primaryStage) {
        final int NUMBER_OF_BUTTONS = 2;

        this.primaryStage = primaryStage;
        buttons = new Button[NUMBER_OF_BUTTONS];
    }

    public Button[] getButtons() {
        return buttons;
    }

    public void loadButton(int index) {
        buttons[index] = new Button(primaryStage);
        buttons[index].loadSample();
    }

    public void loadButtons() {
        for(int i = 0; i < buttons.length; i++) {
            buttons[i] = new Button(primaryStage);
            buttons[i].loadSample();
        }
    }

}
