import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int m = s.nextInt();

        int[][] inputArr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                inputArr[i][j] = s.nextInt();
            }
        }

        int numberOfConsecutiveSeatsUserWant = s.nextInt();

//        int rowWhereUserCanGetConsecutiveSeats = 0;

        for (int a = 0; a < n; a++) {
            int count = 0;

            for (int b = 0; b < m; b++) {
                if (inputArr[a][b] == 0) {
                    count++;
                    if (count == numberOfConsecutiveSeatsUserWant) {
                        System.out.println(a + 1);
                        return;
                    }
                } else {
                    count = 0;
                }
            }

        }

        System.out.println(0);
    }
}