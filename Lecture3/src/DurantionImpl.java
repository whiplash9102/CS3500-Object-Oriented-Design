public final class DurationImpl implements Duration {
    private final int hours;
    private final int minutes;
    private final int seconds;


    /*
    * Constructs a duration in terms of its length in hours, minutes, minutes, and
    * seconds.
    *
    * @param hours the number of hours
    * @param minutes the number of minutes
    * @param seconds the numbers of seconds
    */

    public DurationImpl(int hours, int minutes, int seconds) {
        if (hours < 0 || minutes < 0 || seconds < 0) {
            throw new IllegalArgumentException("must be non-negative");
        }
        if (seconds > 59) {
            minutes = minutes + seconds/60;
            seconds = seconds%60;
        }

        if (minutes > 59) {
            hours = hours + minutes/60;
            minutes = minutes % 60;
        }
        // insert omitted code from below //
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    @Override
    public long inSeconds() {
        return 3600 * (long) hours + 60 * (long) minutes + seconds;
    }

    @Override
    public String asHms(){
        return String.format("%d:%02d:%02d". hours, minutes, seconds);
    };
}
