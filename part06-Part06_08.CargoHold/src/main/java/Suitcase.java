/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Velux
 */
import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> items;
    private int maximumWeight;

    public Suitcase(int maximumWeight) {
        this.items = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Item item : items) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }

    public void addItem(Item item) {
        if (totalWeight() + item.getWeight() <= maximumWeight) {
            items.add(item);
        }
        return;
    }

    public String toString() {

        String weightOutput = " (" + totalWeight() + "kg)";
        String itemOutput = "";

        if (items.isEmpty()) {
            itemOutput = "no items";
        } else if (items.size() == 1) {
            itemOutput = "1 item";
        } else {
            itemOutput = items.size() + " items";
        }

        return itemOutput + weightOutput;
    }

    public void printItems() {
        for (Item el : items) {
            System.out.println(el);
        }
    }

    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }
        Item heaviestItem = items.get(0);
        for (Item el : items) {
            if (heaviestItem.getWeight() < el.getWeight()) {
                heaviestItem = el;
            }
        }
        return heaviestItem;
    }

}
