package Week4;

public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;

    public NumberStatistics() {
        this.amountOfNumbers = 0;
        this.sum = 0;
    }
    public void addNumbers(int numbers) {
        if(numbers != -1) {
            this.sum = this.sum + numbers;
        }
        this.amountOfNumbers++;
    }

    public int getAmountOfNumbers() {
        return this.amountOfNumbers;
    }

    public int getSum() {
        return this.sum;
    }

    public double average() {
        double sum = 0.0;
        if(this.amountOfNumbers>0) {
            sum = (double)this.sum/(double)this.amountOfNumbers;
            return sum;
        } else {
            return 0.0;
        }
    }
}
