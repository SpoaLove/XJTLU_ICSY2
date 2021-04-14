package cn.edu.xjtlu.cpt105.week7;
/*
 * CW1 Week 6, to be used again in Week 7
 * Complete using your codes in Week 6 or the solutions
 *
 */

public class Clock {
    private int hours;
    private int minutes;

    // CW1 6.1
    // Creates a clock whose initial time is h hours and m minutes.
    public Clock(int h, int m) {
        this.hours   = h;
        this.minutes = m;
    }

    // CW1 6.2
    // Creates a clock whose initial time is specified as a string, using the format HH:MM.
    public Clock(String s) {
        this.hours   = Integer.parseInt(s.substring(0,2));
        this.minutes = Integer.parseInt(s.substring(3,5));
    }

    // CW1 6.3
    // Returns a string representation of this clock, using the format HH:MM.
    public String toString() {
        return String.format("%02d:%02d", hours,minutes);
    }

    // CW1 6.4
    // Is the time on this clock earlier than the time on that one?
    public boolean isEarlierThan(Clock that) {
        return (hours < that.hours) || (hours == that.hours && minutes < that.minutes);
    }

    // CW1 6.5
    // Adds 1 minute to the time on this clock.
    public void tick() {
        if (++minutes == 60) {
            minutes = 0;
            hours = (hours+1) % 24;
        }
    }

    // CW1 6.6
    // Adds delta minutes to the time on this clock.
    public void tock(int delta) {
        minutes += delta;

        while (minutes >= 60) {
            minutes -= 60;
            hours = (hours+1) % 24;
        }

        while (minutes < 0) {
            minutes += 60;
            hours = hours == 0 ? 23 : hours - 1;
        }
    }
    
    // Getters
    public int getHours() {
        return hours;
    }
    public int getMinutes() {
        return minutes;
    }
    
}
