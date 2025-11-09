package main.java;

public class GameContext {
    private SceneManager sceneManager;

    public GameContext(SceneManager sm) {
        this.setSceneManager(sm);
    }

    public SceneManager getSceneManager() {
        return sceneManager;
    }

    public void setSceneManager(SceneManager sceneManager) {
        this.sceneManager = sceneManager;
    }
}
