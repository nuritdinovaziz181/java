class Task13 {
    public static void main(String[] args) {
        int n = 20;
        int[] C = new int[n];
        int sum = 0;

        // Массивті кездейсоқ сандармен толтыру
        for (int i = 0; i < n; i++) {
            C[i] = (int)(Math.random() * 100);  // 0 мен 100 арасында
            sum += C[i];
        }

        // Орташа мәнді есептеу
        double average = (double) sum / n;

        System.out.println("Массив элементтері:");
        for (int i = 0; i < n; i++) {
            System.out.print(C[i] + " ");
        }

        System.out.println("\nОрташа мән: " + average);
    }
}