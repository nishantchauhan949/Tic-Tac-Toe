import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int len = s.nextInt();

        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = s.nextInt();
        }

        int sum = 0;

        for (int var : arr) {
            sum += var;
        }

        System.out.println(sum);
    }
}