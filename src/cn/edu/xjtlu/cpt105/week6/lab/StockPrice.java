package cn.edu.xjtlu.cpt105.week6.lab;

import java.time.LocalDate;

/**
 * @author Hsun.Pu20
 */
public class StockPrice {

    /* Fields */

    private final String    ticker;
    private final LocalDate date;
    private final double    open;
    private final double    high;
    private final double    low;
    private final double    close;
    private final long      volume;

    /* Constructors */

    public StockPrice(String ticker, LocalDate date, double open, double high, double low, double close, long volume) {
        this.ticker = ticker;
        this.date = date;
        this.open = open;
        this.high = high;
        this.low = low;
        this.close = close;
        this.volume = volume;
        System.out.println("Stock " + ticker + " " + date + " created.");
    }

    public StockPrice(String ticker, String date, double open, double high, double low, double close, long volume) {
        this(ticker,stringToDate(date),open,high,low,close,volume);
    }

    private static LocalDate stringToDate(String date) {
        String[] dateArr = date.split("-");
        LocalDate localDate =  LocalDate.of(
                Integer.parseInt(dateArr[0]),
                Integer.parseInt(dateArr[1]),
                Integer.parseInt(dateArr[2])
        );

        return localDate;
    }

    /* Getters */

    public String getTicker() {
        return ticker;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getOpen() {
        return open;
    }

    public double getHigh() {
        return high;
    }

    public double getLow() {
        return low;
    }

    public double getClose() {
        return close;
    }

    public long getVolume() {
        return volume;
    }

    /**
     * Returns the spread of the stock.
     * The spread is the difference between the highest price
     * and the lowest price, i.e. high – low.
     * @return spread of the stock.
     */
    public double getSpread() {
        return  high - low;
    }

    @Override
    public String toString() {
        return "Stock price ticker is " + ticker
                +"\n  -- Opening price is " + open
                +"\n  -- Closing price is " + close;
    }

    @Override
    public boolean equals(Object obj) {
        return toString().equals(obj.toString());
    }
}
