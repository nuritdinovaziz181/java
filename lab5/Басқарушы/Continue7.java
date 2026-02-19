package Басқарушы;

public class Continue7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (String.valueOf(i).contains("7")) continue;
            System.out.print(i + " ");
        }
    }
}