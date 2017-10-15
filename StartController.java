public class StartController  extends Start{
    private Launchpad launchpad;

    public StartController() {
        launchpad = getLaunchpad();
    }

    public String getSongName (int bankIndex, int row, int col) {
        return launchpad.getBanks()[bankIndex].getButtons()[row][col].toString();
    }
}
