package han.propedeuse.oopd.yeager.game.entities.buttons;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;
import com.github.hanyaeger.api.userinput.MouseEnterListener;
import com.github.hanyaeger.api.userinput.MouseExitListener;
import han.propedeuse.oopd.yeager.game.TheIntelligentGamer;
import javafx.scene.Cursor;
import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class startButton extends TextEntity implements MouseButtonPressedListener, MouseEnterListener, MouseExitListener {

    TheIntelligentGamer theIntelligentGamer;

    public startButton(Coordinate2D initialLocation, TheIntelligentGamer theIntelligentGamer) {
        super(initialLocation, "Play Game");
        setFill(Color.WHITE);
        setFont(Font.font("Copperplate Gothic Bold", FontWeight.BOLD, 30));
        this.theIntelligentGamer = theIntelligentGamer;
    }

    @Override
    public void onMouseButtonPressed(MouseButton mouseButton, Coordinate2D coordinate2D) {
        theIntelligentGamer.setActiveScene(2);
    }

    @Override
    public void onMouseEntered() {
        setFill(Color.ORANGE);
        setCursor(Cursor.HAND);
    }

    @Override
    public void onMouseExited() {
        setFill(Color.WHITE);
        setCursor(Cursor.DEFAULT);
    }
}
