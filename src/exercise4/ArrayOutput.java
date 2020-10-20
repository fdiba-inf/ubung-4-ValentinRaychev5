package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOutput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int length = input.nextInt();
        int[] numbers = new int[length];

        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }
        String space = "";
        for (int i = 0; i <numbers.length; i++)  {
          System.out.println(space + numbers[i]);
          space += " ";
        }
        
    }

}
