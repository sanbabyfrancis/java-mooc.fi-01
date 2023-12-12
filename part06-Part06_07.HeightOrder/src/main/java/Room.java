import java.util.ArrayList;

public class Room {
    private ArrayList<Person> people;

    public Room() {
        people = new ArrayList<>();
    }

    public void add (Person person) {
        this.people.add(person);
    }

    public boolean isEmpty() {
        if (this.people.size() == 0) {
            return true;
        }
        return false;
    }

    public ArrayList<Person> getPersons() {
        return this.people;
    }

    public Person shortest() {
        Person smallest = null;
        if (this.people.size() == 0) {
            smallest = null;
        } else if (this.people.size() == 1) {
            smallest = this.people.get(0);
        } else {
            smallest = this.people.get(0);
            for (int i = 0; i < this.people.size(); i++) {
                if (this.people.get(i).getHeight() < smallest.getHeight()) {
                    smallest = this.people.get(i);
                }
            }
        }
        return smallest;
    }

    public Person take() {
        Person smallest = this.shortest();
        if (smallest != null) {
            this.people.remove(smallest);
        }
        return smallest;
    }
}
