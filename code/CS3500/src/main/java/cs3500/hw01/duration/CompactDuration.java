package cs3500.hw01.duration;

/**
 * Durations represented compactly, with a range of 0 to
 * 2<sup>63</sup>-1 hours.
 */
public final class CompactDuration extends AbstractDuration {
  /**
   * Constructs a duration in terms of its length in weeks, days, and
   * hours.
   *
   * @param weeks the number of weeks
   * @param days  the number of days
   * @param hours the number of hours
   * @throws IllegalArgumentException if any argument is negative
   */
  public CompactDuration(int weeks, int days, int hours) {
    ensureWdh(weeks, days, hours);
    this.inHours = inHours(weeks, days, hours);
  }

  /**
   * Constructs a duration in terms of its length in hours.
   *
   * @param inHours the number of hours (non-negative)
   * @throws IllegalArgumentException {@code inHours} is negative
   */
  public CompactDuration(long inHours) {
    if (inHours < 0) {
      throw new IllegalArgumentException("must be non-negative");
    }

    this.inHours = inHours;
  }

  private final long inHours;

  @Override
  protected Duration fromHours(long inHours) {
    return new CompactDuration(inHours);
  }

  @Override
  public long inHours() {
    return inHours;
  }

  @Override
  public String asWdh() {
    return asWdh(weeksOf(inHours),
                 daysOf(inHours),
                 hoursOf(inHours));
  }

  @Override
public String format(String formatType) {
    return "";
}

}
