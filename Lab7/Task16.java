class Task16 {
    public static void main(String[] args) {
        int n = 25;
        int[] A = new int[n];
        int max = Integer.MIN_VALUE;


        for (int i = 0; i < n; i++) {
            A[i] = (int)(Math.random() * 100);  // 0 мен 100 арасында
            if (A[i] > max) {
                max = A[i];
            }
        }

        System.out.println("Массив элементтері:");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }

        System.out.println("\nМаксимал элемент: " + max);
    }
}