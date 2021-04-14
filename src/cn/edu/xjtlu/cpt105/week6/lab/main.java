package cn.edu.xjtlu.cpt105.week6.lab;

import java.util.Arrays;

public class main {

    public static double getLowestOpeningPrice(StockPrice[] stockPrices) {
        System.out.println();
        double lowestOpeningPrice = stockPrices[0].getOpen();
        for (StockPrice stockPrice: stockPrices) {
            if (stockPrice.getOpen()<lowestOpeningPrice)
                lowestOpeningPrice = stockPrice.getOpen();
            System.out.println(stockPrice);
        }
        System.out.println("\nLowest opening price is:" + lowestOpeningPrice);
        return lowestOpeningPrice;
    }

    public int[] getEqualIndices(StockPrice[] stockPrices, StockPrice target) {
        int[] indices = new int[stockPrices.length];
        for (int i = 0, j = 0, k = stockPrices.length-1; i < stockPrices.length; i++) {
            if     (stockPrices[i].equals(target))   indices[j++] = i;
            else/*!(stockPrices[i].equals(target))*/ indices[k--] = -1;
        }
        return indices;
    }

    public static void printAllStocks(StockPrice[] stockPrices) {
        Arrays.stream(stockPrices).forEach(System.out::println);
    }

    public static void main(String[] args) {

        StockPrice[] stockPrices = {
                new StockPrice(
                        "AAPL",
                        "2006-12-1",
                        91.8, 92.33, 90.1, 91.32,
                        28395700),
                new StockPrice(
                        "AAPL",
                        "2006-12-4",
                        91.88, 92.05, 90.5, 91.12,
                        25340600),
                new StockPrice(
                        "AAPL",
                        "2006-12-5",
                        91.655, 92.33, 90.87, 91.27,
                        23672800)
        };

        getLowestOpeningPrice(stockPrices);

        StockPrice comp1 =  new StockPrice(
                "AAPL",
                "2006-12-1",
                91.8, 92.33, 90.1, 91.32,
                28395700);
        System.out.println(stockPrices[0].equals(comp1));
        System.out.println(stockPrices[1].equals(comp1));


    }
}
