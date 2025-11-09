package main.java.Menus;

import java.util.List;

public class MenuData {
    private final String title;
    private final String description;
    private final List<MenuItemData> items;

    public MenuData(String title, String description, List<MenuItemData> items) {
        this.title = title;
        this.description = description;
        this.items = items;
    }

    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public List<MenuItemData> getItems() { return items; }
}
