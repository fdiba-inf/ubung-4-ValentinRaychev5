package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class MinIndex {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int length = input.nextInt();
        double[] numbers = new double[length];
        double currentNum = 0.0;
        int outputIndex = 0; 
        for (int index = 0; index < length; index++) {
            numbers[index] = input.nextInt();
            if (index == 0) {
              currentNum = numbers[index];
              outputIndex = index;
            }
            else  {
              if  (numbers[index] < currentNum)  {
                currentNum = numbers[index];
                outputIndex = index;
              }
              
            }

        }
        System.out.println("Min index: " + outputIndex);

    }

}
