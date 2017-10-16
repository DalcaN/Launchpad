import javafx.scene.media.AudioClip;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;

public class Sample {
    private Stage primaryStage;
    private File file;
    private AudioClip sample;

    public Sample(Stage primaryStage) {
        this.primaryStage = primaryStage;
        file = loadFile();

        String source = file.toURI().toString();
        sample = new AudioClip(source);
    }

    private long getDurationInSeconds() throws UnsupportedAudioFileException, IOException {
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
        AudioFormat format = audioInputStream.getFormat();
        long audioFileLength = file.length();
        int frameSize = format.getFrameSize();
        float frameRate = format.getFrameRate();

        return (long)(audioFileLength / (frameSize * frameRate));
    }

    public File getSource() {
        return file;
    }

    private File loadFile() {
        FileChooser fileChooser = new FileChooser();

        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Audio Files", "*.wav"));

        return fileChooser.showOpenDialog(primaryStage);
    }

    public void play() {
        sample.play();

        try {
            for(long i = 0; i <= getDurationInSeconds(); i++) {
                Thread.sleep(1000);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void stop() {
        sample.stop();
    }
}
