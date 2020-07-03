public abstract class DiceGame
{
    private Dice dice;
    private int rollCount;
    String winOrLose;

    public DiceGame(int numberOfDies)
    {
        //right to left, call Dice class, send value 2, then
        //store in dice instance variable of class DiceGame
        this.dice = (new Dice(numberOfDies));
    }

    public boolean gameOver()
    {
        return gameLost();
    }

    public abstract boolean gameWon();
    public abstract boolean gameLost();


    public int getDiceCount()
    {
        return dice.roll();
    }

    public int getTotalValue()
    {
        //int totalValue = getDiceCount();

        //totalValue = this.dice.roll();

        return dice.getTotalValue();
    }

    public int rollCount()
    {
        return rollCount = rollCount + 1;
    }

    // this method is ran when you roll the dice a second time
    // it knows roll() is in Dec class because the 'dice' is a reference
    // variable to Dice class
    public int roll()
    {
        return this.dice.roll();
    }
}
