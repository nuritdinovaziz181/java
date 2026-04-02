import java.util.*;

public class InputCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter number: ");
            double num = sc.nextDouble();
            System.out.println("You entered: " + num);
        } catch (InputMismatchException e) {
            System.out.println("Error! Enter numbers only.");
        }
    }
}