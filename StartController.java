import javafx.fxml.FXML;

import java.awt.event.ActionEvent;

public class StartController  extends Start{
    private Launchpad launchpad;

    public StartController() {
        launchpad = getLaunchpad();
    }

    @FXML
    public String getSongName (int bankIndex, int row, int col) {
        return launchpad.getCurrentPlayableButtons()[row][col].toString();
    }

    @FXML
    public void playButton (int row, int col) {
        launchpad.pressButton(row, col);
    }

    @FXML
    public void selectBank(int bankIndex) {
        launchpad.selectBank(bankIndex);
    }
}
