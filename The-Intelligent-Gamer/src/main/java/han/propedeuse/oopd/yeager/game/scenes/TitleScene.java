package han.propedeuse.oopd.yeager.game.scenes;

import com.github.hanyaeger.api.scenes.StaticScene;
import javafx.scene.paint.Color;

public class TitleScene extends StaticScene {

    @Override
    public void setupScene() {
        setBackgroundAudio("audio/titleSceneTrack.mp3");
        setBackgroundColor(Color.CHOCOLATE);
    }

    @Override
    public void setupEntities() {

    }
}
