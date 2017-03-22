package restaurant;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Kevin on 3/13/2017.
 */
public class Menu {

    private ArrayList<MenuItem> items = new ArrayList<>();

    public Menu() {}

    public Menu(ArrayList<MenuItem> items) {
        this.items = items;
    }


    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public void addItem(MenuItem item) {
        this.items.add(item);
    }

    public void removeItem(MenuItem item) {
        this.items.remove(item);
    }

    @Override
    public String toString() {
        return "Menu{" +
                "items=" + items +
                '}';
    }
}