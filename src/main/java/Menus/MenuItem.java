package main.java.Menus;

public class MenuItem {
    private int id;
    private String description;
    private IAction action;

    public MenuItem(int id, String desc, IAction action){
        this.id = id;
        this.description = desc;
        this.action = action;
    }

    public String getDescription(){
        return description;
    }

    public void trigger(){
        action.execute();
    }

    public int getID() {
        return id;
    }
}
