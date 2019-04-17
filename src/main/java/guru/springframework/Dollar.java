package guru.springframework;

import java.util.Objects;

public class Dollar
{
  private int amount;

  public Dollar(int amount)
  {
    this.amount = amount;
  }

  public Dollar times(int multiplier)
  {
    return new Dollar(this.amount * multiplier);
  }

  @Override
  public boolean equals(Object o)
  {
    if (this == o)
    {
      return true;
    }
    if (!(o instanceof Dollar))
    {
      return false;
    }
    Dollar dollar = (Dollar) o;
    return amount == dollar.amount;
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(amount);
  }
}
