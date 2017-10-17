import javafx.stage.Stage;
import java.io.File;
import java.util.List;

public class Button {
    private Sample sample;
    private File file;

    public void loadSample(File file) {
        sample = new Sample(file);
        this.file = file;
        System.out.println("Loaded: " + getFileName());
    }

    public void press() {
        sample.play();
    }

    public String getFilePath() {
        String output = file.toURI().toString();
        return output;
    }

    public String getFileName() {
        String output = file.toURI().toString();
        int index = output.lastIndexOf('/');
        output = output.substring(index + 1).replaceAll("%20", " ");
        if(output.lastIndexOf(".wav") != -1) {
            output = output.substring(0, output.indexOf(".wav"));
        }
        return output;
    }
}
