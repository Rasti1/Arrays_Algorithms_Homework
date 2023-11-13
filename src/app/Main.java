package app;

import java.util.Scanner;

public class Main {
    static int count;
    static double averagePrice;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday",
                "Friday", "Saturday", "Sunday"};
        System.out.print("Enter the daily price:\n");
        double sum = 0;

        double[] dailyPrices = new double[7];

        for (int i = 0; i < days.length; i++) {
            count++;
            System.out.print(count + ") " + days[i] + ": ");
            dailyPrices[i] = sc.nextDouble();
            sum += dailyPrices[i];
        }

        for (int i = 0; i < dailyPrices.length - 1; i++) {
            for (int j = 0; j < dailyPrices.length - 1 - i; j++) {
                if (dailyPrices[j] > dailyPrices[j + 1]) {
                    // Swap values
                    double temp = dailyPrices[j];
                    dailyPrices[j] = dailyPrices[j + 1];
                    dailyPrices[j + 1] = temp;
                }
            }
        }

        System.out.println("\nSorted daily prices:");
        for (int i = 0; i < days.length; i++) {
            System.out.print(dailyPrices[i] + "; \n");
        }

        averagePrice = sum / 7;
        System.out.printf("\nAverage sum of the week is: %.2f%n", averagePrice);
        sc.close();
    }
}
