public class Container {
    int amount;

    public Container() {
        this.amount = 0;
    }

    public int contains() {
        return this.amount;
    }

    public void add(int amount) {
        if (amount > 0) {
            if (this.amount + amount > 100) {
                this.amount = 100;
            } else {
                this.amount = this.amount + amount;
            }
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            if (this.amount - amount < 0) {
                this.amount = 0;
            } else {
                this.amount = this.amount - amount;
            }
        }
    }

    public String toString() {
        return this.amount + "/100";
    }
}
