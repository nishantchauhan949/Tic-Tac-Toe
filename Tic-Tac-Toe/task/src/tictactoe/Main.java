package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        char[] charArr;

        String str = s.nextLine();
        charArr = str.toCharArray();

        System.out.println("---------");

        for (int i = 0; i < 9; ) {

            System.out.println("| " + charArr[i++] + " " + charArr[i++] + " " + charArr[i++] + " |");

        }

        System.out.println("---------");
    }
}
