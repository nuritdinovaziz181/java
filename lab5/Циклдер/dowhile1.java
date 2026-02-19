package Циклдер;

import java.util.Scanner;

public class dowhile1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pass;

        do {
            System.out.print("Пароль енгіз: ");
            pass = sc.nextLine();
        } while (!pass.equals("1234"));

        System.out.println("Дұрыс пароль!");
    }
}