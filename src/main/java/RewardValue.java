public class RewardValue
{
    double cashValue;
    double milesValue;
    RewardValue(double cashValue)
    {
        this.cashValue = cashValue;
    }

    RewardValue(int milesValue)
    {
        this.milesValue = milesValue;
    }

    double getCashValue()
    {
        return cashValue;
    }

    int getMilesValue()
    {
        return (int)(cashValue / 0.0035);
    }
}
