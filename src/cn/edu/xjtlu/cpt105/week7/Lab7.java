package cn.edu.xjtlu.cpt105.week7;

public class Lab7 {

    static int getNumOfQuery(StockPricePlus[] stockPrices){
        int sum = 0;
        for (StockPricePlus s : stockPrices) {
            System.out.println(s);
            sum += s.getQueries();
        }
        System.out.println("Total number of queries: "+sum);
        return sum;
    }

    static void getStockInfo(StockPrice[] stockPrices) {
        for (StockPrice  s : stockPrices) {
            System.out.println(s instanceof StockPrice);
            System.out.println(s instanceof StockPricePlus);
        }
    }


    public static void main(String[] args) {
        StockPricePlus[] stockPrices = {
                new StockPricePlus(
                        "AAPL",
                        "2006-12-1",
                        91.8, 92.33, 90.1, 91.32,
                        28395700),
                new StockPricePlus(
                        "AAPL",
                        "2006-12-4",
                        91.88, 92.05, 90.5, 91.12,
                        25340600),
                new StockPricePlus(
                        "AAPL",
                        "2006-12-5",
                        91.655, 92.33, 90.87, 91.27,
                        23672800)
        };

        StockPrice[] stockPrices2 = {
                new StockPricePlus(
                        "AAPL",
                        "2006-12-1",
                        91.8, 92.33, 90.1, 91.32,
                        28395700),
                new StockPrice(
                        "AAPL",
                        "2006-12-4",
                        91.88, 92.05, 90.5, 91.12,
                        25340600),
                new StockPricePlus(
                        "AAPL",
                        "2006-12-5",
                        91.655, 92.33, 90.87, 91.27,
                        23672800)
        };

        getNumOfQuery(stockPrices);
        getStockInfo(stockPrices2);

    }
}
