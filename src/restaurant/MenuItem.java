package restaurant;

import java.time.LocalDateTime;

/**
 * Created by Kevin on 3/13/2017.
 */
public class MenuItem {

    private double price;
    private String description;
    private String category;
    private final LocalDateTime created = LocalDateTime.now();

    // constructor
    public MenuItem(double price, String description, String category) {
        this.price = price;
        this.description = description;
        this.category = category;
    }

    public boolean isNew() {
        if (this.getCreated().minusDays(30).isBefore(this.getCreated())) {
            return true;
        } else {
            return false;
        }
    }


    public double getPrice() { return price; }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public String toString() {
        return "$ " + price + " - " + description + " (" + category + ") -    Time Created: " + created;
    }
}

