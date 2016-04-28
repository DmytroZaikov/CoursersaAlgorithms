package commonhelpers;

import java.util.Random;

public class ArraysHelper {


    private static int randInt(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }

    public static Integer[] arrayOfIntInit(int arrayLength){
        Integer[] a = new Integer[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            a[i] = randInt(1, 10);
        }
        return a;
    }

    public static void arrayPrettyPrint(Comparable[] arrayToPrint){
        for (Comparable item: arrayToPrint) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
