import java.util.Scanner;

public class Lab6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Вариант номерін енгізіңіз (1-15): ");
        int variant = input.nextInt();

        System.out.print("x мәнін енгізіңіз: ");
        double x = input.nextDouble();

        double f = 0;

        switch (variant) {

            case 1:
                if (x >= 5)
                    f = Math.pow(x, 3) + 7;
                else if (x > 2 && x < 5)
                    f = 5 * x - 6;
                break;

            case 2:
                if (x >= 0)
                    f = Math.pow(x, 3) + 5;
                else if (x > -3 && x < 0)
                    f = 3 * Math.pow(x, 4) + 9;
                break;

            case 3:
                if (x > 0)
                    f = Math.pow(x, 5) + 3.5;
                else if (x > 4 && x <= 5)
                    f = Math.pow(x, 3) + 6 * Math.pow(x, 2) - 2;
                break;

            case 4:
                if (x >= 1.22)
                    f = 5 * Math.pow(x, 3) + 1.7;
                else
                    f = x * Math.cos(x);
                break;

            case 5:
                if (x > 5 && x <= 9)
                    f = 5 * Math.pow(x, 2) + 1.6;
                else if (x >= 2)
                    f = 3 * Math.pow(x, 4) + 7;
                else if (x > 0 && x < 2)
                    f = Math.pow(x, 3) * Math.cos(x);
                break;

            case 6:
                if (x >= 2.5)
                    f = 3 * Math.pow(x, 3) + 5;
                else if (x >= 1.5 && x < 2.5)
                    f = Math.pow(x, 3) * Math.sin(x);
                else
                    f = x * Math.tan(x) * Math.sin(x);
                break;

            case 7:
                if (x >= 1)
                    f = 5 * Math.sin(x) + 9;
                else if (x > 0 && x < 1)
                    f = 3 * Math.pow(x, 2) + 4 * Math.cos(x);
                break;

            case 8:
                if (x > 0 && x < 2)
                    f = 5 * x * Math.cos(x);
                else if (x > -5 && x < 0)
                    f = Math.pow(x, 3);
                break;

            case 9:
                if (x > 2)
                    f = 1.7 * Math.pow(x, 3) + 7;
                else if (x >= 1 && x <= 2)
                    f = Math.pow(x, 3) + 6 * Math.sin(x);
                else if (x > 0 && x < 1)
                    f = Math.pow(x, 2) * Math.cos(x) * Math.sin(x);
                break;

            case 10:
                if (x > 2 && x <= 6)
                    f = Math.tan(x) + Math.cos(x) + 3.5;
                else if (x > 0)
                    f = Math.pow(x, 2) * Math.sin(x) + x + 1.2;
                break;

            case 11:
                if (x > 4)
                    f = Math.log(x) + 3 * x + 7;
                else if (x > 0 && x <= 4)
                    f = Math.sin(x) + Math.pow(x, 5) + 6;
                break;

            case 12:
                if (x > 2 && x <= 6)
                    f = Math.cos(x) + Math.tan(x);
                else if (x > 0 && x <= 2)
                    f = 1.7 * x + Math.sin(x);
                break;

            case 13:
                if (x > 3 && x <= 5)
                    f = Math.exp(x) * x + Math.exp(2);
                else if (x > 1 && x <= 3)
                    f = Math.sin(5 * x) * (1 + x * Math.log(x));
                break;

            case 14:
                if (x > 1 && x <= 4)
                    f = Math.tan(3 * x) + Math.log(5 * x);
                else if (x >= -1 && x <= 1)
                    f = Math.pow(x, 2) - Math.pow(x, 3);
                break;

            case 15:
                if (x > 3 && x <= 7)
                    f = 1.5 * Math.pow(x, 3) + Math.exp(2 * x) * Math.log(x);
                else if (x > 1 && x <= 3)
                    f = Math.pow(x, 4) * Math.sin(x) + Math.log(x);
                break;

            default:
                System.out.println("Қате вариант!");
                return;
        }

        System.out.println("f(x) = " + f);
    }
}