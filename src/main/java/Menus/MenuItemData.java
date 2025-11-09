package main.java.Menus;

public class MenuItemData {
    private final int id;
    private final String label;
    private final String actionId;

    public MenuItemData(int id, String label, String actionId) {
        this.id = id;
        this.label = label;
        this.actionId = actionId;
    }

    public int getId() { return id; }
    public String getLabel() { return label; }
    public String getActionId() { return actionId; }
}
