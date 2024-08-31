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

    double getMilesValue()
    {
        return cashValue / 0.0035;
    }
}
