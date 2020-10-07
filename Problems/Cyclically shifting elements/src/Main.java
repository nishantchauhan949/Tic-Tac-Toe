import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt(); // len means number of elements the array will have

        int[] arr = new int[len]; // arr means array

        for (int i = 0; i < len; i++) {
            arr[i] = scanner.nextInt();
        }

        int curr = Integer.MIN_VALUE; //curr means current element
        int next = Integer.MIN_VALUE;

        for (int i = 1; i < len; i++) {
            if (i != len - 1) {

            } else {

            }
        }
    }
}