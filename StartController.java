import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.input.MouseEvent;



public class StartController extends Start{

    @FXML private Button ls;

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

    public void setButtonTexts () {
        a10.setText(launchpad.getCurrentPlayableButtons()[0][0].toString());
        a11.setText(launchpad.getCurrentPlayableButtons()[0][1].toString());
//        a12.setText(launchpad.getCurrentPlayableButtons()[0][2].toString());
//        a13.setText(launchpad.getCurrentPlayableButtons()[0][3].toString());

//        a20.setText(launchpad.getCurrentPlayableButtons()[1][0].toString());
//        a21.setText(launchpad.getCurrentPlayableButtons()[1][1].toString());
//        a22.setText(launchpad.getCurrentPlayableButtons()[1][2].toString());
//        a23.setText(launchpad.getCurrentPlayableButtons()[1][3].toString());
//
//        a30.setText(launchpad.getCurrentPlayableButtons()[2][0].toString());
//        a31.setText(launchpad.getCurrentPlayableButtons()[2][1].toString());
//        a32.setText(launchpad.getCurrentPlayableButtons()[2][2].toString());
//        a33.setText(launchpad.getCurrentPlayableButtons()[2][3].toString());
//
//        a40.setText(launchpad.getCurrentPlayableButtons()[3][0].toString());
//        a41.setText(launchpad.getCurrentPlayableButtons()[3][1].toString());
//        a42.setText(launchpad.getCurrentPlayableButtons()[3][2].toString());
//        a43.setText(launchpad.getCurrentPlayableButtons()[3][3].toString());
    }

    @FXML
    public void onMouseClicked (MouseEvent click) {
        if(click.getButton().toString().equals("PRIMARY")) {
            launchpad = new Launchpad(primaryStage);
            launchpad.loadBanks();
            ls.setDisable(true);
            ls.setText("Soundpack loaded!");

            setButtonTexts();
        }
    }

    @FXML public void keyPressedF1(MouseEvent event) {
        launchpad.selectBank(0);
        setButtonTexts();
    }
    @FXML public void keyPressedF2 (MouseEvent event) {
        launchpad.selectBank(1);
        setButtonTexts();
    }
    @FXML public void keyPressedF3 (MouseEvent event) {
        launchpad.selectBank(2);
        setButtonTexts();
    }
    @FXML public void keyPressedF4 (MouseEvent event) {
        launchpad.selectBank(3);
        setButtonTexts();
    }

    @FXML public void keyPressed1 (MouseEvent event) {
        launchpad.getCurrentPlayableButtons()[0][0].press();
    }
    @FXML public void keyPressed2 (MouseEvent event) {
        launchpad.getCurrentPlayableButtons()[0][1].press();
    }
    @FXML public void keyPressed3 (MouseEvent event) {
        launchpad.getCurrentPlayableButtons()[0][2].press();
    }
    @FXML public void keyPressed4 (MouseEvent event) {
        launchpad.getCurrentPlayableButtons()[0][3].press();
    }

    @FXML public void keyPressedQ (MouseEvent event) {
        launchpad.getCurrentPlayableButtons()[1][0].press();
    }
    @FXML public void keyPressedW (MouseEvent event) {
        launchpad.getCurrentPlayableButtons()[1][1].press();
    }
    @FXML public void keyPressedE (MouseEvent event) {
        launchpad.getCurrentPlayableButtons()[1][2].press();
    }
    @FXML public void keyPressedR (MouseEvent event) {
        launchpad.getCurrentPlayableButtons()[1][3].press();
    }

    @FXML public void keyPressedA (MouseEvent event) {
        launchpad.getCurrentPlayableButtons()[2][0].press();
    }
    @FXML public void keyPressedS (MouseEvent event) {
        launchpad.getCurrentPlayableButtons()[2][1].press();
    }
    @FXML public void keyPressedD (MouseEvent event) {
        launchpad.getCurrentPlayableButtons()[2][2].press();
    }
    @FXML public void keyPressedF (MouseEvent event) {
        launchpad.getCurrentPlayableButtons()[2][3].press();
    }

    @FXML public void keyPressedZ (MouseEvent event) {
        launchpad.getCurrentPlayableButtons()[3][0].press();
    }
    @FXML public void keyPressedX (MouseEvent event) {
        launchpad.getCurrentPlayableButtons()[3][1].press();
    }
    @FXML public void keyPressedC (MouseEvent event) {
        launchpad.getCurrentPlayableButtons()[3][2].press();
    }
    @FXML public void keyPressedV (MouseEvent event) {
        launchpad.getCurrentPlayableButtons()[3][3].press();
    }

}
