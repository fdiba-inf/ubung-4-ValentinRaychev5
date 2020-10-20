package exercise4;

import java.util.Arrays;
import java.util.Scanner;

import sun.security.util.Length;

public class MaxElement {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }
        for (int i = 0; i <numbers.length; i++)  {
          String space = "";
          System.out.println(space + numbers[i]);
          space += " ";
        }
    }

}
