class Task5 {
    public static void main(String[] args) {
        double[] D = new double[17];
        double sum = 0;

        // Кездейсоқ сандармен толтыру
        for (int i = 0; i < 17; i++) {
            D[i] = Math.random() * 20 - 10;  // -10 мен 10 арасындағы сандар
            sum += D[i];
        }

        double mean = sum / D.length;
        System.out.println("Арифметикалық орта: " + mean);
    }
}