package main.java.Scenes;

import main.java.GameContext;
import main.java.Menus.Menu;
import main.java.Menus.MenuData;

import java.util.Scanner;

public class Scene implements IScene {
    Menu menu;
    GameContext game;
    Scanner scanner = new Scanner(System.in);

    public Scene(GameContext context, MenuData data) {
        this.game = context;
        this.menu = new Menu(context, data);
    }

    public Menu getMenu() {
        return menu;
    }

    public void update() {
        menu.display();
        this.handleUserInput();
    }

    private void handleUserInput() {
        String userInput = scanner.nextLine();
        if(userInput.equals("exit") || userInput.equals("quit")) {
            game.getSceneManager().exitGame();
        } else {
            int choice;

            try {
                choice = Integer.parseInt(userInput);
            } catch (NumberFormatException e) {
                throw new NumberFormatException();
            }

            if (this.menu.contains(choice)) {
                menu.select(choice);
            } else {
                this.update();
            }
        }
    }
}
