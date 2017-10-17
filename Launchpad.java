import javafx.stage.Stage;

public class Launchpad {
    private Stage primaryStage;
    private Button[][] currentPlayableButtons;
    private Bank[] banks;

    public Launchpad(Stage primaryStage) {
        this.primaryStage = primaryStage;
        banks = new Bank[4];
    }

    public void loadBanks() {
        for(int i = 0; i < banks.length; i++) {

            switch(i + 1) {
                case 1: System.out.println("Please select samples for the 1st bank"); break;
                case 2: System.out.println("Please select samples for the 2nd bank"); break;
                case 3: System.out.println("Please select samples for the 3rd bank"); break;
                default: System.out.println("Please select samples for the " + i + "th bank"); break;
            }

            banks[i] = new Bank(primaryStage);
            banks[i].loadButtons();
        }

        selectBank(0);
    }

    public void selectBank(int index) {
        currentPlayableButtons = banks[index].getButtons();
        System.out.println(this);
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
