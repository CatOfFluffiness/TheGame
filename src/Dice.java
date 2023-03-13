import java.util.Random;

public class Dice {
    public Random diceNum;

    public Dice() {this.diceNum = new Random();}

    public int roll () {
        return (diceNum.nextInt(20) + 1);
    }
}
