package Басқарушы;

public class Continue4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (i % 4 == 0) continue;
            System.out.print(i + " ");
        }
    }
}