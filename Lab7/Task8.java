class Task8 {
    public static void main(String[] args) {
        double[][] A = new double[12][6];
        double product;

        // Массивті кездейсоқ сандармен толтыру
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 6; j++) {
                A[i][j] = Math.random() * 20 - 10;  // -10 мен 10 арасындағы сандар
            }
        }

        // Әр баған бойынша теріс элементтердің көбейтіндісін есептеу
        for (int j = 0; j < 6; j++) {
            product = 1;
            for (int i = 0; i < 12; i++) {
                if (A[i][j] < 0) {
                    product *= A[i][j];
                }
            }
            System.out.println("A[" + j + "] бағаны бойынша теріс элементтердің көбейтіндісі: " + product);
        }
    }
}