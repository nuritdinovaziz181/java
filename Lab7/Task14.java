class Task14 {
    public static void main(String[] args) {
        int n = 30;
        int[] D = new int[n];
        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i < n; i++) {
            D[i] = (int)(Math.random() * 100);  // 0 мен 100 арасында
        }

        System.out.println("Массив элементтері:");
        for (int i = 0; i < n; i++) {
            System.out.print(D[i] + " ");
        }

        for (int i = 0; i < n; i++) {
            if (D[i] % 2 == 0) {
                evenSum += D[i];
            } else {
                oddSum += D[i];
            }
        }

        System.out.println("\nЖұп элементтердің қосындысы: " + evenSum);
        System.out.println("Тақ элементтердің қосындысы: " + oddSum);
    }
}