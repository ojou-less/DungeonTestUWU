package de.prog2.uwu;

import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.app.GameSettings;
import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.entity.level.Level;
import com.almasb.fxgl.entity.level.LevelLoader;

import static com.almasb.fxgl.dsl.FXGLForKtKt.getGameWorld;

public class Main extends GameApplication {

    @Override
    protected void initSettings(GameSettings settings){
        settings.setWidth(1280);
        settings.setHeight(720);
    }

    @Override
    protected void initGame() {
        super.initGame();
        FXGL.getGameWorld().addEntityFactory(new Factory());
    }

    public static void main(String[] args) {
        launch(args);
    }
}
