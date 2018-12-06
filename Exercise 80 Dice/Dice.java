import java.util.Random;

public class Dice {
    private Random random = new Random();
    private int numberOfSides;
    //creates a new dice object
    public Dice(int numberOfSides) {
        this.numberOfSides = numberOfSides;
        random = new Random();
    }
    //The method roll tells the result of a roll (which depends on the number of its sides)
    public int roll() {
        // create here a random number belonging to range 1-numberOfSided

        return 1 + random.nextInt(numberOfSides);
    }
}
