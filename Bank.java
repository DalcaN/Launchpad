import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.File;
import java.util.List;

public class Bank {
    private Button[][] buttons;
    private Stage primaryStage;

    public Bank(Stage primaryStage) {
        this.primaryStage = primaryStage;
        buttons = new Button[4][4];
    }

    public Button[][] getButtons() {
        return buttons;
    }

    public void loadButtons() {
        List<File> filesSelected;
        FileChooser fileChooser = new FileChooser();

        fileChooser.setTitle("Choose at least 16 samples!");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Audio Files", "*.wav"));

        while(true) {
            filesSelected = fileChooser.showOpenMultipleDialog(primaryStage);
            if(filesSelected.size() >= 16) {
                break;
            }
            System.out.println("Not enough files for the bank.  There must be at least 16 samples.");
        }

        int filesIndex = 0;

        for(int i = 0; i < buttons.length; i++) {
            for(int j = 0; j < buttons[i].length; j++) {
                buttons[i][j] = new Button();
                buttons[i][j].loadSample(filesSelected.get(filesIndex));
                filesIndex++;
            }
        }
    }
}
