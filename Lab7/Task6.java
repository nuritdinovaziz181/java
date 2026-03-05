class Task6 {
    public static void main(String[] args) {
        int[][] A = new int[10][10];
        int[] B = new int[10];

        // Массивті кездейсоқ сандармен толтыру
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                A[i][j] = (int)(Math.random() * 20 - 10);  // -10 мен 10 арасындағы сандар
            }
        }

        // Әр қатар бойынша теріс элементтердің қосындысын есептеу
        for (int i = 0; i < 10; i++) {
            int sum = 0;
            for (int j = 0; j < 10; j++) {
                if (A[i][j] < 0) {
                    sum += A[i][j];
                }
            }
            B[i] = sum;
            System.out.println("A[" + i + "] қатарындағы теріс элементтердің қосындысы: " + B[i]);
        }
    }
}