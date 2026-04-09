import java.util.Scanner;

public class ReplaceVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String result = str.replaceAll("[aeiouAEIOUәіөұүыӘІӨҰҮЫ]", "*");
        System.out.println(result);
    }
}