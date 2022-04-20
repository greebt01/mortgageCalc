import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double p = 0;
        double r = 0;
        int n = 0;

        while (true) {
            System.out.print("What is the amount of principal? ($1K - $1M)");
            p = scanner.nextDouble();
            if (p>=1_000 && p<=1_000_000) {
                break;
            }
            System.out.print("Enter a number between 1000 and 1000000");
        }
        while (true) {
            System.out.print("What is the annual interest rate? (0% - 30%)");
            r = scanner.nextDouble()/100/12;
            if (r>=0&&r<=30) {
                break;
            }
            System.out.println("Enter a number between 0 and 30");
        }
        while (true) {
            System.out.print("What is the term in years? (1year - 50years)");
            n = scanner.nextInt();
            if (n>=1&&n<=50) {
                break;
            }
            System.out.println("Enter a number between 1 and 50");
        }

        Double myMort = p * ((r * Math.pow(1 + r, n*12))/ (Math.pow(1 + r, n*12) - 1));
        NumberFormat cash = NumberFormat.getCurrencyInstance();
        System.out.println("Your mortgage payment would be " + cash.format(myMort) + " per month for " + n*12 + " months.");
    }
}
