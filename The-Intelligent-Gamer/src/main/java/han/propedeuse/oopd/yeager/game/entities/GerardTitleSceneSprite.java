package han.propedeuse.oopd.yeager.game.entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;

public class GerardTitleSceneSprite extends DynamicSpriteEntity {

    public GerardTitleSceneSprite(Coordinate2D initialLocation) {
        super("sprites/GerardTitleSceneSprite.png", initialLocation,1,15);
        setAutoCycle(10);
    }
}
