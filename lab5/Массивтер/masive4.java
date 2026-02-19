package Массивтер;

public class masive4 {
    public static void main(String[] args) {
        int[][] m = {
                {3,5,1},
                {7,2,9}
        };

        for (int i = 0; i < m.length; i++) {
            int max = m[i][0];

            for (int j = 1; j < m[i].length; j++) {
                if (m[i][j] > max) {
                    max = m[i][j];
                }
            }

            System.out.println("Row " + i + " max = " + max);
        }
    }
}