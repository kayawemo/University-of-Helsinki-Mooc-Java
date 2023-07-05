
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kayod
 */
public class Suitcase {

    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        items = new ArrayList<>();
    }

    public void addItem(Item item) {

        this.items.add(item); // add the items
        int totalWeight = 0;

        for (Item it : items) {
            totalWeight = totalWeight + it.getWeight();
        }

        if (totalWeight > this.maxWeight) {
            this.items.remove(item);
            totalWeight = totalWeight - item.getWeight();

        }
    }
    
    public void printItems() {
        for(Item item : items) {
            System.out.println(item.getName() + " (" + item.getWeight() + " kg)" );
        }
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        for (Item item : items){
            totalWeight = totalWeight + item.getWeight();
        }
        
        return totalWeight;
    }
    
    public Item heaviestItem() {
        
        if(items.isEmpty()) {
            return null;
        }
        
        Item heaviest = items.get(0);
        for (Item item : items) {
            if (heaviest.getWeight() < item.getWeight()) {
                heaviest = item;
            }
        }
        
        return heaviest;
    }
    

    public String toString() {

        if (items.isEmpty()) {
            return "no items (0 kg)";
        }
        int totalWeight = 0;
        for (Item it : items) {
            totalWeight = totalWeight + it.getWeight();
        }

        if (items.size() == 1) {
            return items.size() + " item (" + totalWeight + " kg)";
        }
        return items.size() + " items" + "(" + totalWeight + " kg)";
    }

}
