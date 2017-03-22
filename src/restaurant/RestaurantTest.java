package restaurant;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Kevin on 3/16/2017.
 */
public class RestaurantTest {

    public static void main(String[] args) {

        Menu myMenu = new Menu();

        MenuItem mostaccioli = new MenuItem(9.99, "Mostaccioli", "Main course");
        MenuItem toastedRavioli = new MenuItem(5.49, "Toasted Ravioli", "appetizer");
        MenuItem gooeyButter = new MenuItem(3.79, "Gooey Butter Cake", "dessert");

        myMenu.addItem(mostaccioli);
        myMenu.addItem(toastedRavioli);
        myMenu.addItem(gooeyButter);


        for (MenuItem item : myMenu.getItems()) {
            System.out.println("$" + item.getPrice() + " " + item.getDescription() + " (" + item.getCategory() + ") Added: " + item.getCreated() + " Is it new? " + item.isNew());
        }

        System.out.println("\nNow I'll remove Gooey Butter Cake :(\n");

        myMenu.removeItem(gooeyButter);

        for (MenuItem item : myMenu.getItems()) {
            System.out.println("$" + item.getPrice() + " " + item.getDescription() + " (" + item.getCategory() + ") Added: " + item.getCreated() + " Is it new? " + item.isNew());
        }
    }
}
