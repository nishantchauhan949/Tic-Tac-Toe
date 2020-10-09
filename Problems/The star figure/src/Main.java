import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        String[][] strArr = new String[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i == n / 2 || j == n / 2 || i + j == n - 1) {
                    strArr[i][j] = "*";
                } else {
                    strArr[i][j] = ".";
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(strArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}