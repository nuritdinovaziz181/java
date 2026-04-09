import java.util.Scanner;

public class StartsWithCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String word = sc.nextLine();

        if (str.startsWith(word)) {
            System.out.println("Starts with given word");
        } else {
            System.out.println("Does not start with given word");
        }
    }
}