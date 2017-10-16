import javafx.fxml.FXML;

import java.awt.event.ActionEvent;

public class StartController extends Start{
        @FXML
        public String getSongName (ActionEvent event, int row, int col) {
            return launchpad.getCurrentPlayableButtons()[row][col].toString();
        }

        @FXML
        public void playButton (ActionEvent event, int row, int col) {
            launchpad.pressButton(row, col);
        }

        @FXML
        public void selectBank(ActionEvent event, int bankIndex) {
            launchpad.selectBank(bankIndex);
        }
}
