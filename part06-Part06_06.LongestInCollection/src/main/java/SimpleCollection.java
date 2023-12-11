
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

    public String longest() {
        if (this.elements.size() == 0) {
            return null;
        } else if (this.elements.size() == 1) {
            return this.elements.get(0);
        } else {
            String longestString = this.elements.get(0);
            for (int i = 0; i < this.elements.size() - 1; i++) {
                if (this.elements.get(i).length() < this.elements.get(i + 1).length()) {
                    longestString = this.elements.get(i + 1);
                }
            }
            return longestString;
        }
    }
}
