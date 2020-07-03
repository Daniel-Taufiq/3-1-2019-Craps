public class Driver
{
    public static void main(String[] args)
    {
        DiceGame refVar;

        refVar = new Craps();

        while(!refVar.gameOver())
        {
            refVar.roll();
        }

        System.out.println(refVar.getTotalValue());
    }
}