class Task10 {
    public static void main(String[] args) {
        double[][] D = new double[7][7];
        double sum = 0;

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                D[i][j] = Math.random() * 20 - 10;
            }
        }

        for (int i = 0; i < 7; i++) {
            sum += D[i][i];
        }

        double mean = sum / 7;

        System.out.println("Негізгі диагонал элементтерінің арифметикалық ортасы: " + mean);
    }
}