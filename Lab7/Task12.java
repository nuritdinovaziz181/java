class Task12 {
    public static void main(String[] args) {
        int n = 25;
        int[] B = new int[n];

        for (int i = 0; i < n; i++) {
            B[i] = (int)(Math.random() * 100);  // 0 мен 100 арасында
        }

        System.out.println("Бастапқы массив:");
        for (int i = 0; i < n; i++) {
            System.out.print(B[i] + " ");
        }

        java.util.Arrays.sort(B);

        System.out.println("\nӨсу реті бойынша сұрыпталған массив:");
        for (int i = 0; i < n; i++) {
            System.out.print(B[i] + " ");
        }
    }
}