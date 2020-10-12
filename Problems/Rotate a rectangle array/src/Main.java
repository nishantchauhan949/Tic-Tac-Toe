import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int m = s.nextInt();

        int[][] inArr = new int[n][m];
        int[][] outArr = new int[m][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                inArr[i][j] = s.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                outArr[j][n - i - 1] = inArr[i][j];
            }
        }
        
        //print the array
        for (int p = 0; p < m; p++) {
            for (int q = 0; q < n; q++) {
                System.out.print(outArr[p][q] + " ");
            }
            System.out.println();
        }
    }
}