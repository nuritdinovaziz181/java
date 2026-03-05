class Task2 {
    public static void main(String[] args) {
        int[] B = new int[15];
        int sum = 0;

        for (int i = 0; i < 15; i++) {
            B[i] = (int)(Math.random() * 20 - 10);  // -10 мен 10 арасындағы сандар
            if (B[i] > 0) {
                sum += B[i];
            }
        }

        System.out.println("Оң элементтердің қосындысы: " + sum);
    }
}