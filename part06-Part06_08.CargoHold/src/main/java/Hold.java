import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int maximumWeight;

    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        suitcases = new ArrayList<>();
    } 

    public void addSuitcase(Suitcase suitcase) {
        if (this.getCurrentWeight() + suitcase.totalWeight() <= this.maximumWeight) {
            this.suitcases.add(suitcase);
        }
    }

    public int getCurrentWeight() {
        int currentWeight = 0;
        for (Suitcase suitcase : this.suitcases) {
            currentWeight = currentWeight + suitcase.totalWeight();
        }
        return currentWeight;
    }

    public String toString() {
        return this.suitcases.size() + " suitcases (" + this.getCurrentWeight() + " kg)";
    }

    public void printItems() {
        for (Suitcase suitcase : this.suitcases) {
            suitcase.printItems();
        }
    }
}
