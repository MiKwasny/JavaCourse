package JavaCourse_Section_9_MinElementChallenge_and_ReverseArrayChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class MyOwnMain {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter array lenght:");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] returnedArray = readIntegers(count);
        System.out.println(Arrays.toString(returnedArray));
        int minNumber = findMin(returnedArray);
        System.out.println("min number is: "+minNumber);
    }

    public static int[] readIntegers(int count){


        int[] array = new int[count];

        for(int i =0;i<array.length;i++){
            System.out.println("Please enter the numbers for array:");
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return array;

    }

    public static int findMin(int[] array){
        int min = Integer.MAX_VALUE;

        for(int i =0; i< array.length;i++){
            int value = array[i];
            if(value<min){
                min = value;
            }
        }
        return min;
    }
}
