package ru.netology.stats;

public class StatsService {
    public int sumSales(int[] arr) {
        int sum = 0;
        for (int s : arr) {
            sum += s;
        }
        return sum;
    }

    public int averageSales(int[] arr) {
        int sum = 0;
        for (int y : arr) {
            sum += y;
        }
        return sum / arr.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int belowAverage(int[] sales) {
        int count = 0;
        int average = averageSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                count++;
            }
        }
        return count;
    }

    public int aboveAverage(int[] sales) {
        int count = 0;
        int average = averageSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                count++;
            }
        }
        return count;
    }
}

