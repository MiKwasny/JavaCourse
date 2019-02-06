package JavaCourse_Section_8_ReferenceTypes_vs_ValueTypes;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("my vale = "+myIntValue);
        System.out.println("my another vale = "+anotherIntValue);

        anotherIntValue++;

        //Value types hold value and after it they are independent, changing 1 value jsut changes only this 1 value

        System.out.println("my vale = "+myIntValue);
        System.out.println("my another vale = "+anotherIntValue);

        int[] myIntArray = new int[5];
        int[] myIntArray2 = myIntArray;

        myIntArray2[0] = 1;

        // Reference because they have reference to an adress, so changing 1 changes the other array

        System.out.println("first " +Arrays.toString(myIntArray));
        System.out.println("second " +Arrays.toString(myIntArray2));

        modifyArray(myIntArray);

        System.out.println("first after" +Arrays.toString(myIntArray));
        System.out.println("second after " +Arrays.toString(myIntArray2));
    }

    private static void modifyArray(int[] array){
        array[0] =2;

        // creating new that why its not connected
        array = new int[] {1,2,3,4,5};
    }

}
