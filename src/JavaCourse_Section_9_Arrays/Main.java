package JavaCourse_Section_9_Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myIntArray = new int[10]; //= {1,2,3,4,5,6,7,8,9,10};
        //myIntArray[5] = 15;
        //myIntArray[0] = 1;

        double[] myDoubleArray = new double[10];

//        System.out.println(myIntArray[0]);
//        System.out.println(myIntArray[8]);
//        System.out.println(myIntArray[3]);

        for(int i=0; i<10; i++){
            myIntArray[i] = i*10;

        }

        for(int i=0; i<10; i++){
            System.out.println("Element "+i+", value is " +myIntArray[i]);

        }
    }
}
