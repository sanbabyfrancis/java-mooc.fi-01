import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maximumWeight;

    public Suitcase(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.items = new ArrayList<>();
    }

    public int getCurrentWeight() {
        int currentWeight = 0;
        for (Item item: this.items) {
            currentWeight = currentWeight + item.getWeight();
        }
        return currentWeight;
    }

    public void addItem(Item item) {
        if ((this.getCurrentWeight() + item.getWeight()) <= this.maximumWeight) {
            this.items.add(item);
        }
    }

    public String toString() {
        String returnString = "";
        if (this.items.size() == 0) {
            returnString = "no items (0 kg)";
        } else if (this.items.size() == 1) {
            returnString = "1 item " + "(" + this.getCurrentWeight() + " kg)";
        } else {
            returnString = this.items.size() + " items " + "(" + this.getCurrentWeight() + " kg)";
        }
        return returnString;
    }

    public void printItems() {
        for (Item item: this.items) {
            System.out.println(item.getName() + "(" + item.getWeight() + " kg)");
        }
    }

    public int totalWeight() {
        return this.getCurrentWeight();
    }

    public Item heaviestItem() {
        if (items.size() == 0) {
            return null;
        }
        Item heaviest = this.items.get(0);
        for (Item item : this.items) {
            if (item.getWeight() > heaviest.getWeight()) {
                heaviest = item;
            }
        }
        return heaviest;
    }
}
