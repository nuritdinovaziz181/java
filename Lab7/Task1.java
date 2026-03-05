class Task1 {
    public static void main(String[] args) {
        int[] A = new int[20];
        int sum = 0;


        for (int i = 0; i < 20; i++) {
            A[i] = (int)(Math.random() * 20 - 10);  // -10 мен 10 арасындағы сандар
            if (A[i] < 0) {
                sum += A[i];
            }
        }

        System.out.println("Теріс элементтердің қосындысы: " + sum);
    }
}