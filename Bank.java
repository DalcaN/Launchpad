import javafx.stage.Stage;

public class Bank {
    private Button[][] buttons;
    private Stage primaryStage;

    public Bank(Stage primaryStage) {
        this.primaryStage = primaryStage;
        buttons = new Button[1][2];
    }

    public Button[][] getButtons() {
        return buttons;
    }

    public void loadButton(int row, int col) {
        buttons[row][col] = new Button(primaryStage);
        buttons[row][col].loadSample();
    }

    public void loadButtons() {
        for(int row = 0; row < buttons.length; row++) {
            for(int col = 0; col < buttons[row].length; col++) {
                buttons[row][col] = new Button(primaryStage);
                buttons[row][col].loadSample();
            }
        }
    }

}
