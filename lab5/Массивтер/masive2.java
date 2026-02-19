package Массивтер;

public class masive2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,8};

        int count = 0;

        for (int num : arr) {
            if (num % 2 == 0) count++;
        }

        System.out.println("Жұп саны: " + count);
    }
}