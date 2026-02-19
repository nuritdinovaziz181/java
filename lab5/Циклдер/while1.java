package Циклдер;

import java.util.Scanner;

public class while1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        while (true) {
            System.out.print("Оң сан енгіз: ");
            num = sc.nextInt();
            if (num > 0) break;
        }

        System.out.println("Рахмет!");
    }
}