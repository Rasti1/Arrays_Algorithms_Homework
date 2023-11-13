package app;

import java.util.Scanner;

public class Main {
    static int count;
    static double dailyPrice;
    static double averagePrice;


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String [] days = {"Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday", "Saturday", "Sunday"};
        System.out.print("Enter the daily price:" + "\n");
        double sum = 0;

        for (int i = 0; i < days.length; i++){
            count++;
            System.out.print(count + ") " + days[i] + ": ");
            dailyPrice = sc.nextDouble();
            sum += dailyPrice;
        }
        averagePrice = sum / 7;
        System.out.printf("\nAverage sum of the week is: %.2f%n", averagePrice);
        sc.close();
    }
}
