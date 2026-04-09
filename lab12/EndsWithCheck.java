import java.util.Scanner;

public class EndsWithCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String ending = sc.nextLine();

        if (str.endsWith(ending)) {
            System.out.println("Ends with given part");
        } else {
            System.out.println("Does not end with given part");
        }
    }
}