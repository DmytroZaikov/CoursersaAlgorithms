package elementarysorts;

import commonhelpers.ArraysHelper;
import commonhelpers.Timerz;


public class Client {
    private static int ARRAY_LENGTH = 100;

    public static void main(String[] args){
        Timerz t = new Timerz();
        Integer[] a1 = ArraysHelper.arrayOfIntInit(ARRAY_LENGTH);
        Integer[] a2 = ArraysHelper.arrayOfIntInit(ARRAY_LENGTH);

        System.out.println("Selection Sort:");
        System.out.println("Before sorting:");
        ArraysHelper.arrayPrettyPrint(a1);

        t.start();
        SelectionSorts.sort(a1);
        t.stop();

        System.out.println("After sorting:");
        ArraysHelper.arrayPrettyPrint(a1);
        System.out.println("Elapsed time: " + t.getElapsedTime());

        System.out.println("Insertion Sort:");
        System.out.println("Before sorting:");
        ArraysHelper.arrayPrettyPrint(a2);

        t.start();
        InsertionSort.sort(a2);
        t.stop();

        System.out.println("After sorting:");
        ArraysHelper.arrayPrettyPrint(a2);
        System.out.println("Elapsed time: " + t.getElapsedTime());
        //Connectivity
    }
}
