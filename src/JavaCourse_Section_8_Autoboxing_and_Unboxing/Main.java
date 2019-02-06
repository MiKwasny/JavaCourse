package JavaCourse_Section_8_Autoboxing_and_Unboxing;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[] strArray = new String[8];
        int[] intArray = new int [10];

        ArrayList<String> arrListSTR = new ArrayList<>();

        ArrayList<Integer> arrListINT = new ArrayList<>();

        //Autoboxing - converting int into a class Integer
        for(int i=0;i<=10;i++){
            arrListINT.add(Integer.valueOf(i));
        }
        //Unboxing - taking from the class and converting back to primitive type
        for(int i=0;i<=10;i++){
            System.out.println(i+" -> "+arrListINT.get(i).intValue());
        }

        Integer myInyValue = 56; //Integer.valueOf(56);
        Double myDoubleValue = 12.12;
        int myInt = myInyValue.intValue();

        ArrayList<Double> doubleArray = new ArrayList<>();
        for(double dbl = 0.0;dbl<10.0;dbl+=0.5){
            doubleArray.add(dbl);
        }

        ArrayList<Double> doubleArray1 = new ArrayList<>();
        for(int i = 0;i<10;i++){
            double value = doubleArray.get(i);
        }
    }

}
