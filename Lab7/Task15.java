class Task15 {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 5;
        int[][] A = new int[rows][cols];


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                A[i][j] = (int)(Math.random() * 10);  // 0 мен 9 арасында
            }
        }


        System.out.println("3x5 кестесі:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}