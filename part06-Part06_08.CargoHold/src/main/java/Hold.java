
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
public class Hold {

    private int maxWeight;
    private ArrayList<Suitcase> suitcase;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcase = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suit) {
        
        this.suitcase.add(suit);
         int total = 0;
       
        for (Suitcase s : suitcase){
            total += s.totalWeight();
        }
        
        if (total > this.maxWeight){
            this.suitcase.remove(suit);
            total = total - suit.totalWeight();
        }
        
    }

    public void printItems() {
        suitcase.forEach(suit -> {
            suit.printItems();
        });
    }

    @Override
    public String toString() {

        int total = 0;
        total = suitcase.stream().map(suit -> suit.totalWeight()).reduce(total, Integer::sum);
        return suitcase.size() + " suitcases " + "(" + total + " kg)";
    }
}
