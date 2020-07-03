public class Craps extends DiceGame
{
    private int thePoint;
    private int boolResult;
    private boolean gameResult;
    String winOrLose;

    public Craps()
    {
        super(2);   // send 2 dice to parent class constructor
        roll();
    }

    @Override
    public boolean gameWon()
    {
        return gameResult;
    }

    @Override
    public boolean gameLost()
    {
        return gameResult;
    }

    private void setGameLost(int numValue)
    {
        gameResult = false; // false = stay in loop
        if (numValue == 2 || numValue == 4)
        {
            gameResult = true;  // exit loop
        }
    }

    private void setGameWon(int numValue)
    {
        gameResult = false;
        if (numValue == 1 || numValue == 3) // you win
            gameResult = true;                      // exit loop
    }

    private void setThePoint(int point)
    {
        thePoint = point;
        System.out.println("Your set point number: " + thePoint);
    }

    public int getThePoint()
    {
        return thePoint;
    }

    public int roll()
    {
        //boolean setPointBool;
        if (rollCount() == 1)
        {
            if (getTotalValue() == 7 || getTotalValue() == 11)
            {
                //setPointBool = gameOver();
                setGameWon(1); // shooter wins come out roll
                System.out.print("You win, you rolled: ");

            } else if (getTotalValue() == 2 || getTotalValue() == 3 || getTotalValue() == 12)
            {
                setGameLost(2);
                System.out.print("You lose, you rolled: ");
            } else
            {
                setThePoint(getTotalValue());
                boolResult = 5;
            }
        }
        else
        {
            super.roll();
            if(getTotalValue() == getThePoint())
            {
                setGameWon(3);
                System.out.print("You win, you rolled: ");
            }
            else if(getTotalValue() == 7) // boolResult = 0;
            {
                setGameLost(4);
                System.out.print("You lose, you rolled: ");
            }
        }

        return boolResult;
    }
}