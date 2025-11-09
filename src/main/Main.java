package main;

import main.java.GameContext;
import main.java.SceneManager;
import main.java.Scenes.MainMenuScene;

public class Main {
    public static void main(String[] args) {
        GameContext game = new GameContext(new SceneManager());

        game.getSceneManager().switchTo(new MainMenuScene(game));

        while (true) {
            game.getSceneManager().update();
        }
    }
}