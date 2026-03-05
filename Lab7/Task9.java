class Task9 {
    public static void main(String[] args) {
        int[][] C = new int[5][5];
        int product = 1;

        // Массивті кездейсоқ сандармен толтыру
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                C[i][j] = (int)(Math.random() * 20 - 10);  // -10 мен 10 арасындағы сандар
            }
        }

        // Негізгі диагонал бойынша оң элементтердің көбейтіндісін есептеу
        for (int i = 0; i < 5; i++) {
            if (C[i][i] > 0) {
                product *= C[i][i];
            }
        }

        System.out.println("Негізгі диагоналдың оң элементтерінің көбейтіндісі: " + product);
    }
}