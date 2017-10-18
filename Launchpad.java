import javafx.stage.Stage;

import java.io.File;

public class Launchpad {
    private Stage primaryStage;
    private Button[][] currentPlayableButtons;
    private Bank[] banks;

    public Launchpad(Stage primaryStage) {
        this.primaryStage = primaryStage;
        banks = new Bank[4];
    }

    public void loadNewBanks() {
        for(int i = 0; i < banks.length; i++) {

            switch(i + 1) {
                case 1: System.out.println("Please select samples for the 1st bank"); break;
                case 2: System.out.println("Please select samples for the 2nd bank"); break;
                case 3: System.out.println("Please select samples for the 3rd bank"); break;
                default: System.out.println("Please select samples for the " + i + "th bank"); break;
            }

            banks[i] = new Bank(primaryStage);
            banks[i].loadNewButtons();
        }

        selectBank(0);
    }

    public void loadDefaultBanks() {
        File bankFolder1 = new File("/Users/Dan/Desktop/Launchpad/Soundpack/Bank 1/");
        File bankFolder2 = new File("/Users/Dan/Desktop/Launchpad/Soundpack/Bank 2/");
        File bankFolder3 = new File("/Users/Dan/Desktop/Launchpad/Soundpack/Bank 3/");
        File bankFolder4 = new File("/Users/Dan/Desktop/Launchpad/Soundpack/Bank 4/");

        for(int i = 0; i < banks.length; i++) {
            banks[i] = new Bank(primaryStage);
            switch (i + 1) {
                case 1: banks[i].loadDefaultButtons(bankFolder1); break;
                case 2: banks[i].loadDefaultButtons(bankFolder2); break;
                case 3: banks[i].loadDefaultButtons(bankFolder3); break;
                case 4: banks[i].loadDefaultButtons(bankFolder4); break;
            }
        }

        selectBank(0);
    }

    public void selectBank(int index) {
        currentPlayableButtons = banks[index].getButtons();
        //System.out.println(this);
    }

    public Button[][] getCurrentPlayableButtons() {
        return currentPlayableButtons;
    }

    @Override
    public String toString() {
        String output = "\nCurrent Playable Buttons are:\n";

        for (int row = 0; row < currentPlayableButtons.length; row++) {
            for(int col = 0; col < currentPlayableButtons[row].length; col++) {
                output += currentPlayableButtons[row][col].getFileName() + "\n";
            }
        }

        output += "\n";

        return output;
    }

}
