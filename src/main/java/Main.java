import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the amount of principal?");
        Double p = scanner.nextDouble();
        System.out.print("What is the annual interest rate?");
        Double r = scanner.nextDouble()/100/12;
        System.out.print("What is the term in years?");
        Integer n = scanner.nextInt()*12;
        Double myMort = p * ((r * Math.pow(1 + r, n))/ (Math.pow(1 + r, n) - 1));
        NumberFormat cash = NumberFormat.getCurrencyInstance();
        System.out.println("Your mortgage payment would be " + cash.format(myMort) + " per month for " + n + " months.");
    }
}
