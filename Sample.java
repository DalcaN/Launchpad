import javafx.scene.media.AudioClip;
import java.io.File;

public class Sample {
    private AudioClip sample;

    public Sample(File file) {
        String source = file.toURI().toString();
        sample = new AudioClip(source);
    }

    public void play() {
        sample.play();
    }
}
