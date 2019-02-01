package JavaCourse_Section_9_MinElementChallenge_and_ReverseArrayChallenge;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter count:");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] returnedArray = readIntegers(count);
        int returnedMin = findMind(returnedArray);

        System.out.println("min = "+returnedMin);
    }

    private static int[] readIntegers(int count){

        int[] array = new int[count];

        for(int i=0; i<array.length;i++){
            System.out.println("Enter a number:");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }

        return array;
    }

    private static int findMind(int[] array){

        int min = Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++){
            int value = array[i];
            if(value < min){
                min = value;
                System.out.println("lol:" +min);
            }
        }
        return min;

    }
}
