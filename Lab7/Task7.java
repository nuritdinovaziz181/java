class Task7 {
    public static void main(String[] args) {
        double[][] B = new double[5][5];
        double[] A = new double[5];

        // Массивті кездейсоқ сандармен толтыру
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                B[i][j] = Math.random() * 20 - 10;  // -10 мен 10 арасындағы сандар
            }
        }

        // Әр қатар бойынша оң элементтердің қосындысын есептеу
        for (int i = 0; i < 5; i++) {
            double sum = 0;
            for (int j = 0; j < 5; j++) {
                if (B[i][j] > 0) {
                    sum += B[i][j];
                }
            }
            A[i] = sum;
            System.out.println("B[" + i + "] қатарындағы оң элементтердің қосындысы: " + A[i]);
        }
    }
}