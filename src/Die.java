public class Die
{
    private int value;

    public Die() {roll();}

    public int getValue()
    {
        return value;
    }

    @Override
    public String toString()
    {
        return "You rolled " + getValue();
    }

    public int roll()
    {
        return value = (int) (Math.random() * 6) + 1;
    }
}
