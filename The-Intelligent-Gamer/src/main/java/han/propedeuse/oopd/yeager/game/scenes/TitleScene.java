package han.propedeuse.oopd.yeager.game.scenes;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.scenes.StaticScene;
import han.propedeuse.oopd.yeager.game.TheIntelligentGamer;
import han.propedeuse.oopd.yeager.game.entities.GerardTitleSceneSprite;
import han.propedeuse.oopd.yeager.game.entities.buttons.startButton;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class TitleScene extends StaticScene {

    TheIntelligentGamer theIntelligentGamer;

    public TitleScene(TheIntelligentGamer theIntelligentGamer){
        this.theIntelligentGamer = theIntelligentGamer;
    }

    @Override
    public void setupScene() {
        setBackgroundAudio("audio/titleSceneTrack.mp3");
        setBackgroundColor(Color.CHOCOLATE);
    }

    @Override
    public void setupEntities() {

        TextEntity gameTitle = new TextEntity(
                new Coordinate2D(getWidth() / 2, getHeight() / 2 - 200),
                "The Intelligent Gamer"
                );    gameTitle.setFill(Color.WHITE);
                      gameTitle.setAnchorPoint(AnchorPoint.CENTER_CENTER);
                      gameTitle.setFont(Font.font("Copperplate Gothic Bold", FontWeight.BOLD, 80));
                      addEntity(gameTitle);

                      addEntity(new startButton(new Coordinate2D(getWidth() / 2 - 75, getHeight() /2 - 100), theIntelligentGamer));
                      addEntity(new GerardTitleSceneSprite(new Coordinate2D(getWidth() / 2 - 100, getHeight() / 2 - 120)));
    }
}
