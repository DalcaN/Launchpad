import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.MenuItem;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;

import java.util.Timer;
import java.util.TimerTask;

public class StartController extends Start{
    @FXML private Button a00;
    @FXML private Button a01;
    @FXML private Button a02;
    @FXML private Button a03;

    @FXML private Button a10;
    @FXML private Button a11;
    @FXML private Button a12;
    @FXML private Button a13;

    @FXML private Button a20;
    @FXML private Button a21;
    @FXML private Button a22;
    @FXML private Button a23;

    @FXML private Button a30;
    @FXML private Button a31;
    @FXML private Button a32;
    @FXML private Button a33;

    @FXML private Button a40;
    @FXML private Button a41;
    @FXML private Button a42;
    @FXML private Button a43;

    @FXML private GridPane gridPane;
    @FXML private MenuItem newSoundpack;
    @FXML private MenuItem lastSoundpack;
    @FXML private MenuItem defaultSoundpack;
    @FXML private CheckMenuItem hideSongNames;
    @FXML private CheckMenuItem hideBankNames;
    @FXML private MenuItem keyHelp;

    @FXML public void keyboardMode (KeyEvent event) {
        switch (event.getCode()) {
            case F1:
                launchpad.selectBank(0);
                if(!hideSongNames.isSelected()) {
                    refreshButtonText();
                }
                bankSelector(1);
                break;
            case F2:
                launchpad.selectBank(1);
                if(!hideSongNames.isSelected()) {
                    refreshButtonText();
                }
                bankSelector(2);
                break;
            case F3:
                launchpad.selectBank(2);
                if(!hideSongNames.isSelected()) {
                    refreshButtonText();
                }
                bankSelector(3);
                break;
            case F4:
                launchpad.selectBank(3);
                if(!hideSongNames.isSelected()) {
                    refreshButtonText();
                }
                bankSelector(4);
                break;

            case DIGIT1:
                launchpad.getCurrentPlayableButtons()[0][0].press(); pressButton(a10); break;
            case DIGIT2:
                launchpad.getCurrentPlayableButtons()[0][1].press(); pressButton(a11); break;
            case DIGIT3:
                launchpad.getCurrentPlayableButtons()[0][2].press(); pressButton(a12); break;
            case DIGIT4:
                launchpad.getCurrentPlayableButtons()[0][3].press(); pressButton(a13); break;

            case Q:
                launchpad.getCurrentPlayableButtons()[1][0].press(); pressButton(a20); break;
            case W:
                launchpad.getCurrentPlayableButtons()[1][1].press(); pressButton(a21); break;
            case E:
                launchpad.getCurrentPlayableButtons()[1][2].press(); pressButton(a22); break;
            case R:
                launchpad.getCurrentPlayableButtons()[1][3].press(); pressButton(a23); break;

            case A:
                launchpad.getCurrentPlayableButtons()[2][0].press(); pressButton(a30); break;
            case S:
                launchpad.getCurrentPlayableButtons()[2][1].press(); pressButton(a31); break;
            case D:
                launchpad.getCurrentPlayableButtons()[2][2].press(); pressButton(a32); break;
            case F:
                launchpad.getCurrentPlayableButtons()[2][3].press(); pressButton(a33); break;

            case Z:
                launchpad.getCurrentPlayableButtons()[3][0].press(); pressButton(a40); break;
            case X:
                launchpad.getCurrentPlayableButtons()[3][1].press(); pressButton(a41); break;
            case C:
                launchpad.getCurrentPlayableButtons()[3][2].press(); pressButton(a42); break;
            case V:
                launchpad.getCurrentPlayableButtons()[3][3].press(); pressButton(a43); break;

            case MINUS:
                if(hideSongNames.isSelected()) {
                    refreshButtonText();
                    hideSongNames.setSelected(false);
                } else {
                    hideButtonText();
                    hideSongNames.setSelected(true);
                }
                break;

            case EQUALS:
                if(hideBankNames.isSelected()) {
                    refreshBankText();
                    hideBankNames.setSelected(false);
                } else {
                    hideBankText();
                    hideBankNames.setSelected(true);
                }
                break;
        }
    }
    private void pressButton (Button btn) {
        btn.getStyleClass().remove("armed");
        btn.getStyleClass().remove("disarmed");
        btn.getStyleClass().add("armed");
        btn.arm();
        Timer timer = new Timer();
        TimerTask resetButtonColor = new TimerTask() {
            @Override
            public void run() {
                btn.getStyleClass().remove("armed");
                btn.getStyleClass().remove("disarmed");
                btn.getStyleClass().add("disarmed");
                btn.arm();
            }
        };

        timer.schedule(resetButtonColor, 200);
    }
    private void toggleButton (Button btn) {
        if(btn.isArmed()) {
            btn.getStyleClass().remove("armed");
            btn.getStyleClass().remove("disarmed");
            btn.getStyleClass().add("disarmed");
            btn.disarm();
        } else {
            btn.getStyleClass().remove("armed");
            btn.getStyleClass().remove("disarmed");
            btn.getStyleClass().add("armed");
            btn.arm();
        }
    }
    private void bankSelector (int i) {
        switch (i) {
            case 1:
                if ( !a00.isArmed() ) {
                    toggleButton(a00);
                }
                if ( a01.isArmed() ) {
                    toggleButton(a01);
                }
                if ( a02.isArmed() ) {
                    toggleButton(a02);
                }
                if ( a03.isArmed() ) {
                    toggleButton(a03);
                }
                break;

            case 2:
                if ( a00.isArmed() ) {
                    toggleButton(a00);
                }
                if ( !a01.isArmed() ) {
                    toggleButton(a01);
                }
                if ( a02.isArmed() ) {
                    toggleButton(a02);
                }
                if ( a03.isArmed() ) {
                    toggleButton(a03);
                }
                break;

            case 3:
                if ( a00.isArmed() ) {
                    toggleButton(a00);
                }
                if ( a01.isArmed() ) {
                    toggleButton(a01);
                }
                if ( !a02.isArmed() ) {
                    toggleButton(a02);
                }
                if ( a03.isArmed() ) {
                    toggleButton(a03);
                }
                break;

            case 4:
                if ( a00.isArmed() ) {
                    toggleButton(a00);
                }
                if ( a01.isArmed() ) {
                    toggleButton(a01);
                }
                if ( a02.isArmed() ) {
                    toggleButton(a02);
                }
                if ( !a03.isArmed() ) {
                    toggleButton(a03);
                }
                break;
        }
    }

    @FXML public void loadNewSoundpack (ActionEvent event) {
        launchpad = new Launchpad(primaryStage);
        launchpad.loadNewBanks();

        refreshButtonText();
        refreshBankText();

        hideSongNames.setSelected(false);
        hideBankNames.setSelected(false);
    }
    @FXML public void loadDefaultSoundpack (ActionEvent event) {
        launchpad = new Launchpad(primaryStage);
        launchpad.loadDefaultBanks();

        refreshButtonText();
        refreshBankText();

        hideSongNames.setSelected(false);
        hideBankNames.setSelected(false);
    }

    @FXML public void hideSongNames(ActionEvent event) {
        if(hideSongNames.isSelected()) {
            hideButtonText();
        } else {
            refreshButtonText();
        }
    }
    private void hideButtonText () {
        a10.setText("");
        a11.setText("");
        a12.setText("");
        a13.setText("");

        a20.setText("");
        a21.setText("");
        a22.setText("");
        a23.setText("");

        a30.setText("");
        a31.setText("");
        a32.setText("");
        a33.setText("");

        a40.setText("");
        a41.setText("");
        a42.setText("");
        a43.setText("");
    }
    private void refreshButtonText () {
        a10.setText(launchpad.getCurrentPlayableButtons()[0][0].getFileName());
        a11.setText(launchpad.getCurrentPlayableButtons()[0][1].getFileName());
        a12.setText(launchpad.getCurrentPlayableButtons()[0][2].getFileName());
        a13.setText(launchpad.getCurrentPlayableButtons()[0][3].getFileName());

        a20.setText(launchpad.getCurrentPlayableButtons()[1][0].getFileName());
        a21.setText(launchpad.getCurrentPlayableButtons()[1][1].getFileName());
        a22.setText(launchpad.getCurrentPlayableButtons()[1][2].getFileName());
        a23.setText(launchpad.getCurrentPlayableButtons()[1][3].getFileName());

        a30.setText(launchpad.getCurrentPlayableButtons()[2][0].getFileName());
        a31.setText(launchpad.getCurrentPlayableButtons()[2][1].getFileName());
        a32.setText(launchpad.getCurrentPlayableButtons()[2][2].getFileName());
        a33.setText(launchpad.getCurrentPlayableButtons()[2][3].getFileName());

        a40.setText(launchpad.getCurrentPlayableButtons()[3][0].getFileName());
        a41.setText(launchpad.getCurrentPlayableButtons()[3][1].getFileName());
        a42.setText(launchpad.getCurrentPlayableButtons()[3][2].getFileName());
        a43.setText(launchpad.getCurrentPlayableButtons()[3][3].getFileName());
    }

    @FXML public void hideBankNames(ActionEvent event) {
        if(hideBankNames.isSelected()) {
            hideBankText();
        } else {
            refreshBankText();
        }
    }
    private void hideBankText() {
        a00.setText("");
        a01.setText("");
        a02.setText("");
        a03.setText("");
    }
    private void refreshBankText() {
        a00.setText("BANK 1");
        a01.setText("BANK 2");
        a02.setText("BANK 3");
        a03.setText("BANK 4");
    }
}
