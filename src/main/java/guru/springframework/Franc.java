package guru.springframework;

import java.util.Objects;

public class Franc extends Money
{
  public Franc(int amount)
  {
    super(amount);
  }

  public Franc times(int multiplier)
  {
    return new Franc(this.amount * multiplier);
  }
}
