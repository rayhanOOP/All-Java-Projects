import java.util.Random;

public class Dice {
    private Random random;
    private int numberOfSides;

    public Dice(int numberOfSides) {
        this.numberOfSides = numberOfSides;// Initialize here the number of sides
        random  = new Random();
    }

    public int roll() {
        // create here a random number belongig to range 1-numberOfSided
        return random.nextInt(this.numberOfSides) + 1;
    }
}
