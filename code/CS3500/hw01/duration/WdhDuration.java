package cs3500.hw01.duration;

/**
 * Durations represented as weeks, days and hours.
 */
public final class WdhDuration extends AbstractDuration {
  /**
   * Constructs a duration in terms of its length in weeks, days, and
   * hours.
   *
   * @param weeks the number of weeks
   * @param days  the number of days
   * @param hours the number of hours
   * @throws IllegalArgumentException if any argument is negative
   */
  public WdhDuration(int weeks, int days, int hours) {
    this(inHours(weeks, days, hours));
    ensureWdh(weeks, days, hours);
  }

  /**
   * Constructs a duration in terms of its length in hours.
   *
   * @param inHours the number of hours (non-negative)
   * @throws IllegalArgumentException {@code inHours} is negative
   */
  public WdhDuration(long inHours) {
    if (inHours < 0) {
      throw new IllegalArgumentException("must be non-negative");
    }

    hours = hoursOf(inHours);
    days = daysOf(inHours);
    weeks = weeksOf(inHours);
  }

  private final int weeks;
  private final int days;
  private final int hours;

  @Override
  protected AbstractDuration fromHours(long inHours) {
    return new WdhDuration(inHours);
  }

  @Override
  public long inHours() {
    return inHours(weeks, days, hours);
  }

  @Override
  public String asWdh() {
    return asWdh(weeks, days, hours);
  }
}
