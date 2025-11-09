package main.java.Scenes.MenuScenes;

import main.java.GameContext;
import main.java.Menus.MenuData;
import main.java.Menus.MenuItemData;

import java.util.List;

public class MainMenuScene extends MenuScene {
    public MainMenuScene(GameContext context) {
        super(context, new MenuData(
                "Main Menu", "Welcome to mockRPG",
                List.of(
                        new MenuItemData(1, "New Game", "new_game"),
                        new MenuItemData(2, "Quit", "quit")
                )
        ));
    }
}
