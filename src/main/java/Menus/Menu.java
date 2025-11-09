package main.java.Menus;

import main.java.GameContext;
import main.java.Scenes.DialogueScene;
import main.java.Scenes.WorldScene;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private final GameContext game;
    private final MenuData menuData;

    private final String title;
    private final String description;
    private final List<MenuItem> items;

    public Menu(GameContext context, MenuData data) {
        items = new ArrayList<>();

        game = context;
        menuData = data;
        title = data.getTitle();
        description = data.getDescription();

        for(MenuItemData itemData : data.getItems()) {
            IAction action = lookupAction(itemData.getActionId());
            items.add(new MenuItem(itemData.getId(), itemData.getLabel(), action));
        }
    }

    private IAction lookupAction(String actionId) {
        return switch (actionId) {
            case "new_game" -> () -> game.getSceneManager().switchTo(new WorldScene(game));
            case "quit" -> () -> game.getSceneManager().exitGame();
            case "begin_dialogue" -> () -> game.getSceneManager().switchTo(new DialogueScene(game));
            case "back" -> () -> game.getSceneManager().goBack();
            default -> () -> System.out.println("No action defined for: " + actionId);
        };
    }

    public boolean contains(int id) {
        for(MenuItem item : items) {
            if(item.getID() == id) {
                return true;
            }
        }
        return false;
    }

    public void display(){
        System.out.flush();
        System.out.println("You are in " + menuData.getTitle());
        System.out.println(menuData.getDescription());
        for (MenuItem item : items) {
            System.out.println(item.getID() + ": " + item.getDescription());
        }
    }

    public void select(int id){
        for(MenuItem item : items) {
            if(item.getID() == id) {
                item.trigger();
            }
        }
    }
}
