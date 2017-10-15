import javafx.stage.Stage;

public class Launchpad {
    private Stage primaryStage;
    private Button[][] currentPlayableButtons;
    private Bank[] banks;

    public Launchpad(Stage primaryStage) {
        final int NUMBER_OF_BANKS = 2;

        this.primaryStage = primaryStage;
        banks = new Bank[NUMBER_OF_BANKS];
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
    }

    public void selectBank(int index) {
        currentPlayableButtons = banks[index].getButtons();
        System.out.println(this);
    }

    public void pressButton(int row, int col) {
        currentPlayableButtons[row][col].press();
    }

    public Bank[] getBanks() {
        return banks;
    }

    @Override
    public String toString() {
        String output = "\nCurrent Playable Buttons are:\n";

        for (int row = 0; row < currentPlayableButtons.length; row++) {
            for(int col = 0; col < currentPlayableButtons[row].length; col++) {
                output += currentPlayableButtons[row][col].toString() + "\n";
            }
        }

        output += "\n";

        return output;
    }

}
