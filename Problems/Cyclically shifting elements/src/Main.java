import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt(); // len means number of elements the array will have

        int[] arr = new int[len]; // arr means array

        for (int i = 0; i < len; i++) {
            arr[i] = scanner.nextInt();
        }

        int curr = arr[0]; //curr means current
        int next = curr;

        for (int i = 0; i < len; i++) {
            if (i < len - 1) {
                curr = next;
                next = arr[i + 1];
                arr[i + 1] = curr;
            } else {
                arr[0] = next;
            }
        }

        for (int var : arr) {
            System.out.print(var + " ");
        }
    }
}