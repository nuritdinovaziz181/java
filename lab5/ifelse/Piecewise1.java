package ifelse;

import java.util.Scanner;

public class Piecewise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y;

        if (x < 0)
            y = x * x;
        else if (x <= 2)
            y = 2 * x;
        else
            y = x + 10;

        System.out.println("y = " + y);
    }
}