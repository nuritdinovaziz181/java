import java.util.Scanner;

public class CountWithoutSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int count = str.replace(" ", "").length();
        System.out.println("Characters (no spaces): " + count);
    }
}