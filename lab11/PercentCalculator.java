import java.util.Scanner;

public class PercentCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        double a = sc.nextDouble();

        System.out.print("Enter percent: ");
        double b = sc.nextDouble();

        double result = (a * b) / 100;
        System.out.println("Result: " + result);
    }
}