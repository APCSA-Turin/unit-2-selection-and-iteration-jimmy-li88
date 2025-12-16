package U3T1;


public class Spinner {
    private int sections;
    private int rollCounter = 0;
    public Spinner(int sections) {
        this.sections = sections;
    } 

    public int spin() {
        rollCounter++;
        return (int) (Math.random() * sections) + 1;
    }
    public int getSpinValue() {
        return (int) (Math.random() * sections) + 1;
    }
    public int getSpinCount() {
        return rollCounter;
    }
    public int getSpinSum() {
        int total = 0; 
        for (int i = 0; i < rollCounter; i++) {
            total += getSpinValue();
        }
        return total;
    }
    public double averageSpin() {
        return (double) getSpinSum() / rollCounter;
    }
}
