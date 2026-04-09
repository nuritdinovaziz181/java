import java.util.Scanner;

public class OnlyDigitsCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if (str.matches("\\d+")) {
            System.out.println("Only digits");
        } else {
            System.out.println("Not only digits");
        }
    }
}