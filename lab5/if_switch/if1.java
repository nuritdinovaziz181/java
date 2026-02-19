//package if_switch;

import java.util.Scanner;

public class if1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Сан енгіз: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("Сан оң");
        } else if (num < 0) {
            System.out.println("Сан теріс");
        } else {
            System.out.println("Сан нөлге тең");
        }
    }
}