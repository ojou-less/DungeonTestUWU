package de.prog2.uwu;

import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.app.GameSettings;

public class Main extends GameApplication {

    @Override
    protected void initSettings(GameSettings settings){
        settings.setWidth(720);
        settings.setHeight(1280);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
