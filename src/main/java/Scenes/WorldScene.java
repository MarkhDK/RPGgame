package main.java.Scenes;

import main.java.GameContext;
import main.java.Menus.Menu;
import main.java.Menus.MenuData;
import main.java.Menus.MenuItemData;

import java.util.List;

public class WorldScene extends Scene {
    public WorldScene(GameContext context) {
        super(context);

        List<MenuItemData> items = List.of(
                new MenuItemData(1, "Talk with trader", "begin_dialogue"),
                new MenuItemData(2, "Quit", "quit")
        );
        MenuData data = new MenuData("Main Menu", "Welcome to mockRPG!", items);
        this.menu = new Menu(context, data);
    }
}
