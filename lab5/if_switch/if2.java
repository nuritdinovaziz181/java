package if_switch;

import java.util.Scanner;

public class if2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Сан енгіз: ");
        int num = sc.nextInt();

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("3-ке де, 5-ке де бөлінеді");
        } else {
            System.out.println("Бөлінбейді");
        }
    }
}