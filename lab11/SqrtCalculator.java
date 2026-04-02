import java.util.Scanner;

public class SqrtCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        double num = sc.nextDouble();

        if (num < 0) {
            System.out.println("Error!");
        } else {
            System.out.println("Result: " + Math.sqrt(num));
        }
    }
}