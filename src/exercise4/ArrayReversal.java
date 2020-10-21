package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReversal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int length = input.nextInt();
        char[] symbols = new char[length];

        for (int index = length - 1; index >= 0; index--) {
            symbols[index] = input.next().charAt(0);
        }
        System.out.println();
        String symbolsAsString = Arrays.toString(symbols);
        System.out.println("Reversed symbols: " + symbolsAsString);
    }

}
