import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int len = s.nextInt();

        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = s.nextInt();
        }

        if (len < 3) {
            System.out.println(0);
            return;
        }

        int tripleCounter = 0;

        for (int i = 2; i < len; i++) {
            if (arr[i - 2] + 1 == arr[i - 1] && arr[i - 1] + 1 == arr[i]) {
                tripleCounter++;
            }
        }

        System.out.println(tripleCounter);
    }
}