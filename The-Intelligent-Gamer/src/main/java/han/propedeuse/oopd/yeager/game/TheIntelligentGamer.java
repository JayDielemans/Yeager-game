package han.propedeuse.oopd.yeager.game;

import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.YaegerGame;

public class TheIntelligentGamer extends YaegerGame {

    public static void main(String[] args) {
       launch(args);
    }

    @Override
    public void setupGame() {
        setGameTitle("The Intelligent Gamer");
        setSize(new Size(1500,750));
    }

    @Override
    public void setupScenes() {

    }
}
