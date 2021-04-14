package cn.edu.xjtlu.cpt105.week7;

/*
 * CW1 Week 7
 */
public class HalloweenClock extends Clock {

    // class variable to store number of ticks
    // of any instances of HalloweenClock so far
    private static int numOfTicks = 0;


    // CW1 7.2
    // Creates a Halloween clock whose initial time is h hours and m minutes.
    public HalloweenClock(int h, int m) {
        super(h, m);
    }


    // CW1 7.3
    // Adds 1 minute to the time on this Halloween clock.
    // In addition, if any Halloween clocks have ticked three times,
    //     print "Halloween!"
    @Override
    public void tick() {
        super.tick();
        numOfTicks = ++numOfTicks % 3;
        if (numOfTicks == 0)
            System.out.println("Halloween!");
    }


    // Test Client
    public static void main(String[] args) {
        HalloweenClock hc1 = new HalloweenClock(1, 0);
        HalloweenClock hc2 = new HalloweenClock(2, 0);
        hc1.tick();
        hc2.tick();
        hc2.tick();  // Halloween!

        HalloweenClock hc3 = new HalloweenClock(3, 30);
        hc1.tick();
        hc2.tick();
        hc3.tick();  // Halloween!
        System.out.println(hc3);  // 03:31
        hc1.tick();
        hc2.tick();
        hc2.tick();  // Halloween!
        hc1.tick();
        hc2.tick();
        hc2.tick();  // Halloween!

    }

}
