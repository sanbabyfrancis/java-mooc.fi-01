public class Timer {
    private ClockHand hundredthSecondHand;
    private ClockHand secondHand;

    public Timer() {
        this.hundredthSecondHand = new ClockHand(100);
        this.secondHand = new ClockHand(60);
    }

    public void advance() {
        this.hundredthSecondHand.advance();

        if (this.hundredthSecondHand.value() == 0) {
            this.secondHand.advance();
        }
    }

    public String toString() {
        return this.secondHand + ":" + this.hundredthSecondHand;
    }
}
