package guru.springframework;

import java.util.Objects;

public class Dollar extends Money
{
  public Dollar(int amount)
  {
    super(amount);
  }

  public Dollar times(int multiplier)
  {
    return new Dollar(this.amount * multiplier);
  }
}
