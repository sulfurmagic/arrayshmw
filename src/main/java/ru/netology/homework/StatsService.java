package ru.netology.homework;

import java.util.Arrays;

public class StatsService {
    public int calcSalesSum(int[] sales) {
        int salesSum = 0;
        for (int sale : sales) {
            salesSum += sale;
        }

        return salesSum;
    }

    public int calsSalesAverage(int[] sales) {
        int salesSum = calcSalesSum(sales);
        int salesAverage = salesSum / sales.length;
        return salesAverage;
    }

    public int findLastMaxSalesMonth(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int findLastMinSalesMonth(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int countBelowAverage(int[] sales) {
        int salesAverage = calsSalesAverage(sales);
        //int salesSum = calcSalesSum(sales);
        int belowMonth = 0;

        for (int sale : sales) {
            if (sale < salesAverage) {
                belowMonth++;
            }

        }
        return belowMonth;

    }

    public int countAboveAverage(int[] sales) {
        int salesAverage = calsSalesAverage(sales);

        int aboveMonth = 0;
        for (int sale : sales) {
            if (sale > salesAverage) {
                aboveMonth++;
            }
        }
        return aboveMonth;
    }

}
