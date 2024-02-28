package ru.netology.homework;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();
        System.out.println();
        System.out.println("сумма продаж за 12 месяцев = " + (service.calcSalesSum((sales))));
        System.out.println("средняя сумма продаж за 12 месяцев = " + (service.calsSalesAverage((sales))));
        System.out.println("номер месяца пика прожаж — " + (service.findLastMaxSalesMonth(sales)));
        System.out.println("номер месяца самых низких продаж — " + (service.findLastMinSalesMonth(sales)));
        System.out.println("сколько месяцев продажи ниже среднего — " + (service.countBelowAverage(sales)));
        System.out.println("сколько месяцев продажи выше среднего — " + (service.countAboveAverage(sales)));


    }



}