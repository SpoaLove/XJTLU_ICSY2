package cn.edu.xjtlu.cpt105.week6.java;

/**
 * CW1 Week 6
 * @author Hsun.Pu20
 */
public class Clock {
    private int hours;
    private int minutes;


    /**
     * CW1 6.1
     * Creates a clock whose initial time is h hours and m minutes.
     * @param h the initial hour of clock.
     * @param m the initial minute of clock.
     */
    public Clock(int h, int m) {
        this.hours   = h;
        this.minutes = m;
    }


    /**
     * CW1 6.2
     * Creates a clock whose initial time is specified as a string, using the format HH:MM.
     * @param s the string specifying the initial clock time in the format HH:MM.
     */
    public Clock(String s) {
        hours   = Integer.parseInt(s.substring(0,2));
        minutes = Integer.parseInt(s.substring(3,5));
    }



    /**
     * CW1 6.3
     * @return a string representation of this clock, using the format HH:MM.
     */
    @Override
    public String toString() {
        return String.format("%02d:%02d", hours,minutes);
    }

    /**
     * CW1 6.4
     * @param that the clock to compare with.
     * @return if this clock is earlier than that clock.
     */
    public boolean isEarlierThan(Clock that) {
        return (hours < that.hours) || (hours == that.hours && minutes < that.minutes);
    }

    /**
     * CW1 6.5
     * Adds 1 minute to the time on this clock.
     */
    public void tick() {
        if (++minutes == 60) {
            minutes = 0;
            hours = (hours+1) % 24;
        }
    }

    /**
     * CW1 6.6
     * Adds delta minutes to the time on this clock.
     * @param delta the minutes to add onto this clock.
     */
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


    public void tock2(int delta) {
        minutes += delta;

        if (minutes >= 60) {
            hours = (hours+minutes/60) % 24;
            minutes = minutes % 60;
        }

        if (minutes < 0) {
//            /*
//             * hours -=
//             */
//            hours = 24 + ((hours+minutes/60) % 24);
//            minutes = (60 + (minutes % 60))%60;
            minutes += 60;
            hours = hours == 0 ? 23 : hours - 1;
        }
    }

    public void tock3(int delta) {
        minutes += delta;

        if (minutes >= 60) {
            hours     = (hours + minutes/60) % 24;
            minutes = minutes % 60;
        }
    }

    // Test client
    public static void main(String[] args) {
        Clock clock1 = new Clock("23:00");
        Clock clock2 = new Clock("23:00");

        System.out.println(clock1);
        System.out.println(clock2);

        clock1.tock(0);
        clock2.tock3(0);

        System.out.println(clock1);
        System.out.println(clock2);
    }
}