class Task11 {
    public static void main(String[] args) {
        int n = 25;
        int[] A = new int[n];


        for (int i = 0; i < n; i++) {
            A[i] = (int)(Math.random() * 100);  // 0 мен 100 арасында
        }

        System.out.println("Массив элементтері:");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }

        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 1; i < n; i++) {
            if (A[i] > A[maxIndex]) {
                maxIndex = i;
            }
            if (A[i] < A[minIndex]) {
                minIndex = i;
            }
        }

        int temp = A[maxIndex];
        A[maxIndex] = A[minIndex];
        A[minIndex] = temp;

        System.out.println("\nМаксимал және минимал элементтер ауыстырылды:");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
    }
}