
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        String output = "";
        for (String element : this.elements) {
            output = output + "\n" + element;
        }
        if (this.getElements().isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }
        if (this.getElements().size() == 1){
            return "The collection " + this.name + " has " + this.getElements().size() + " element:" + output;
        }

        return "The collection " + this.name + " has " + this.getElements().size() + " elements:" + output;

    }
    
}
