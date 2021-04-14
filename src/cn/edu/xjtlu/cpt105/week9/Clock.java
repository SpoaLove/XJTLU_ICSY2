package cn.edu.xjtlu.cpt105.week9;

/*
 * Exercise Week 9
 */
public class Clock {
    private int hours;
    private int minutes;
    

    // Exercise 9.1
    // Creates a clock whose initial time is h hours and m minutes.
    // Throws an IllegalArgumentException if either hours is not between 0 and 23,
    //     or minutes not between 0 and 59
    public Clock(int h, int m) throws IllegalArgumentException {
        if (h<0||h>23||m<0||m>59) throw new IllegalArgumentException();
        hours = h; minutes = m;
    }
    

    // Exercise 9.2
    // Creates a clock whose initial time is specified as a string, using the format HH:MM.
    // Throws an IllegalArgumentException if either the string argument is not in this format,
    //     or if it does not correspond to a valid time between 00:00 and 23:59.
    public Clock(String s) {
        if (s.length()!=5 || s.charAt(2) != ':') throw new IllegalArgumentException();
        int h,m;
        try {
            h = Integer.parseInt(s.substring(0, 2));
            m = Integer.parseInt(s.substring(3,5));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException();
        }
        if (h < 0 || h > 23 || m < 0|| m > 59) throw new IllegalArgumentException();
        hours = h; minutes = m;
    }
    
    
    // Exercise 9.3
    // Adds delta minutes to the time on this clock.
    // Throws an IllegalArgumentException if delta is negative,
    //     and use the message "Illegal negative delta " followed by the negative number.
    public void tock(int delta) {
        if (delta < 0) throw new IllegalArgumentException("Illegal negative delta " + delta);
        minutes += delta;
        while (minutes >= 60) {
            minutes -= 60;
            hours = (hours+1) % 24;
        }
    }

    
    // Returns a string representation of this clock, using the format HH:MM.
    public String toString() {
        String output = "";
        if (hours < 10)
            output = output + "0";
        output = output + hours + ":";
        if (minutes < 10)
            output = output + "0";
        output = output + minutes;
        return output;
    }

    
    // Is the time on this clock earlier than the time on that one?
    public boolean isEarlierThan(Clock that) {
        if (hours < that.hours) {
            return true;
        } else if (hours > that.hours) {
            return false;
        } else return minutes < that.minutes;
    }

    
    // Adds 1 minute to the time on this clock.
    public void tick() {
        minutes++;
        if (minutes == 60) {
            hours++;
            minutes = 0;
            if (hours == 24)
                hours = 0;
        }
    }
    
    
    // Getters
    public int getHours() {
        return hours;
    }
    public int getMinutes() {
        return minutes;
    }
    

    // Test client
    public static void main(String[] args) {
        Clock clock1 = new Clock(1, 0);
        System.out.println(clock1);
        
        try {
            Clock clock2 = new Clock(50, 0);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid argument in constructor 1!");
        }
        
        Clock clock3 = new Clock("02:30");        
        System.out.println(clock3);
        
        try {
            Clock clock4 = new Clock("50:00");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid argument in constructor 2!");
        }
        
        Clock clock5 = new Clock("02:30");
        clock5.tock(100);
        System.out.println(clock5);
        
        try {
            clock5.tock(-50);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
    }
}
