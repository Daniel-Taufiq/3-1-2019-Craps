public class Dice
{
    // this is like creating int[] dice. but instead is an object Die[] dice
    private Die[] dice;
    private int sum = 0;

    public Dice(int howMany)
    {
        if (howMany < 1)
        {
            throw new IllegalArgumentException(getClass().getName() +
                    "Can not create less than one dice: " + howMany);
        }
        // you aren't calling class Die here because [] instead of ()
        // create new Die array object with length 2. indexes = null
        this.dice = new Die[howMany];
        for (int i = 0; i < this.dice.length; i++)
        {
            // look right to left, so it called Die() class first
            // then store value at index of dice
            this.dice[i] = new Die();   // new Die() is creating obj from line 5
            sum = sum + dice[i].getValue();
        }
    }

    public int getTotalValue()
    {
        return sum;
    }

    public int getValue()
    {
        int sum;
        return sum = dice[0].getValue();
    }

    public int getValue(int whichOne)
    {
        return whichOne;
    }

    public int roll()
    {
        int value;
        sum = 0;
        for(int i = 0; i < this.dice.length; i++)
        {
            value = dice[i].roll();

            sum = sum + value;
        }

        return sum;
    }

}