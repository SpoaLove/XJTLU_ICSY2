package cn.edu.xjtlu.cpt105.week7;

import java.time.LocalDate;

public class StockPricePlus extends StockPrice {

    protected int queries;

    public StockPricePlus(String ticker, LocalDate date, double open, double high, double low, double close, long volume) {
        super(ticker, date, open, high, low, close, volume);
        queries = 0;
    }

    public StockPricePlus(String ticker, String date, double open, double high, double low, double close, long volume) {
        super(ticker, date, open, high, low, close, volume);
        queries = 0;
    }

    @Override
    public String toString() {
        return "Stock: ticker= " + ticker
                + " , date= " + date
                + " , opening price= " + open
                + " , closing price= " + close
                + " , high= "  + high
                + " , low= " + low
                + " , volume= " + volume
                + " , Queries: " + ++queries;
    }

    public int getQueries() {
        return queries;
    }
}
