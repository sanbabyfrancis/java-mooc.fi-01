
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

    @Override
    public String toString() {
        String returnString = "";
        if (elements.size() > 1) {
            returnString = "The collection " + this.name + " has " + elements.size() + " elements:";
            for(String element : this.elements) {
                returnString = returnString + "\n" + element;
            }
        } else if (elements.size() == 1) {
            returnString = "The collection " + this.name + " has " + elements.size() + " element:";
            returnString = returnString + "\n" + elements.get(0);

        } else {
            returnString = "The collection " + this.name + " is empty.";
        }
        return returnString;
    }
}
