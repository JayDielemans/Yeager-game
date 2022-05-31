package han.propedeuse.oopd.yeager.game.scenes;

import com.github.hanyaeger.api.scenes.DynamicScene;

public class GameLevel extends DynamicScene {

    @Override
    public void setupScene() {
        setBackgroundAudio("/audio/backgroundTrack.mp3");
        setBackgroundImage("backgrounds/background.png");

    }

    @Override
    public void setupEntities() {

    }
}
