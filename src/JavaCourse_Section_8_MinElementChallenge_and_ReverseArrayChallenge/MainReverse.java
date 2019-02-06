package JavaCourse_Section_8_MinElementChallenge_and_ReverseArrayChallenge;

import java.util.Arrays;

public class MainReverse {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};

        System.out.println("non reversed: "+Arrays.toString(array));
        reverseArray(array);
        System.out.println("reversed: "+Arrays.toString(array));

    }

    public static void reverseArray(int[] array){
        int maxIndex = array.length - 1;
        int halfLenght = array.length/2;
        for (int i=0;i<halfLenght;i++){
            int temp = array[i];
            array[i] = array[maxIndex-i];
            array[maxIndex-i] = temp;

        }
    }
}
