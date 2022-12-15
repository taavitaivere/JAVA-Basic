package Week5;

public class ex84 {
    Integer startingValue;
    Boolean check;
    public ex84(Integer startingValue, Boolean check) {
        this.startingValue = startingValue;
        this.check = check;
    }

    public ex84(Integer startingValue) {
        this(startingValue, false);
    }

    public ex84(boolean check) {
        this(0, check);
    }

    public ex84() {
        this(0, false);
    }

    public int value() {
        return this.startingValue;
    }

    public void increase() {
        if (check) {
            this.startingValue++;
            System.out.println(this.startingValue);
        }
    }

    public void decrease() {
        if (check) {
            this.startingValue--;
            System.out.println(this.startingValue);
        }

        if (check && this.startingValue !=0) {
            this.startingValue--;
        }
    }

    public void main(String[] args) {
            ex84 returns = new ex84(0, true);
            returns.value();
            ex84 increases  = new ex84(0, true);
            increases.increase();
            ex84 decreases  = new ex84(1, true);
            decreases.decrease();
            decreases.decrease();
            decreases.decrease();
            decreases.decrease();
    }
}
