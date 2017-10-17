import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ToggleButton;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;


public class StartController extends Start{

//    @FXML private MenuItem newSoundpack;
//    @FXML private GridPane gridPane;
//
//    @FXML private Button a00;
//    @FXML private Button a01;
//    @FXML private Button a02;
//    @FXML private Button a03;

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

//    @FXML private ToggleButton keyboardMode;

    private void setButtonTexts () {
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

    @FXML public void newSoundpack (ActionEvent event) {
        launchpad = new Launchpad(primaryStage);
        launchpad.loadBanks();
        setButtonTexts();
    }

    @FXML public void keyboardMode (KeyEvent event) {
        switch (event.getCode()) {
            case F1: launchpad.selectBank(0); setButtonTexts(); break;
            case F2: launchpad.selectBank(1); setButtonTexts(); break;
            case F3: launchpad.selectBank(2); setButtonTexts(); break;
            case F4: launchpad.selectBank(3); setButtonTexts(); break;

            case DIGIT1: launchpad.getCurrentPlayableButtons()[0][0].press(); break;
            case DIGIT2: launchpad.getCurrentPlayableButtons()[0][1].press(); break;
            case DIGIT3: launchpad.getCurrentPlayableButtons()[0][2].press(); break;
            case DIGIT4: launchpad.getCurrentPlayableButtons()[0][3].press(); break;

            case Q: launchpad.getCurrentPlayableButtons()[1][0].press(); break;
            case W: launchpad.getCurrentPlayableButtons()[1][1].press(); break;
            case E: launchpad.getCurrentPlayableButtons()[1][2].press(); break;
            case R: launchpad.getCurrentPlayableButtons()[1][3].press(); break;

            case A: launchpad.getCurrentPlayableButtons()[2][0].press(); break;
            case S: launchpad.getCurrentPlayableButtons()[2][1].press(); break;
            case D: launchpad.getCurrentPlayableButtons()[2][2].press(); break;
            case F: launchpad.getCurrentPlayableButtons()[2][3].press(); break;

            case Z: launchpad.getCurrentPlayableButtons()[3][0].press(); break;
            case X: launchpad.getCurrentPlayableButtons()[3][1].press(); break;
            case C: launchpad.getCurrentPlayableButtons()[3][2].press(); break;
            case V: launchpad.getCurrentPlayableButtons()[3][3].press(); break;
        }
    }

}
