package main.java;

import main.java.Scenes.IScene;

import java.util.ArrayDeque;
import java.util.Deque;

public class SceneManager {
    private IScene currentScene;
    private Deque<IScene> sceneStack = new ArrayDeque<>();

    public void switchTo(IScene nextScene) {
        if(currentScene != null) {
            sceneStack.push(currentScene);
        }
        currentScene = nextScene;
    }

    public void goBack() {
        if(!sceneStack.isEmpty()) {
            currentScene = sceneStack.pop();
        }
    }

    public void exitGame() {
        //TODO: save game before exiting
        System.exit(0);
    }

    public void update() {
        currentScene.update();
    }
}
