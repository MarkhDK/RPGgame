package main.java.Scenes.WorldScenes;

import main.java.GameContext;
import main.java.Menus.MenuData;
import main.java.Menus.MenuItemData;

import java.util.List;

public class TownScene extends WorldScene{
    public TownScene(GameContext context) {
        super(context, new MenuData(
                "NoobTown", "You stand on the main road of a small village.",
                List.of(
                        new MenuItemData(1, "Go to tavern", "go_tavern"),
                        new MenuItemData(2, "Go to store", "go_store"),
                        new MenuItemData(3, "Leave town", "leave_area")
                )
        ));
    }
}
