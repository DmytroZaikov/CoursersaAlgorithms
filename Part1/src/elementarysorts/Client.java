package elementarysorts;

import java.util.Random;

public class Client {
    private static int ARRAY_LENGTH = 10000;

    private static int randInt(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }

    private static Integer[] arrayOfIntInit(){
        Integer[] a = new Integer[ARRAY_LENGTH];
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            a[i] = randInt(1, 10);
        }
        return a;
    }

    public static void main(String[] args){

        Integer[] a1 = arrayOfIntInit();
        Integer[] a2 = arrayOfIntInit();

        System.out.println("Selection Sort:");
        System.out.println("Before sorting...");
        for (int num: a1) {
            System.out.print(num + " ");
        }
        long startTime = System.currentTimeMillis();
        SelectionSorts.sort(a1);
        long stopTime = System.currentTimeMillis();

        long elapsedTime = stopTime- startTime;

        System.out.println("\nAfter sorting...");
        for (int num: a1) {
            System.out.print(num + " ");
        }
        System.out.println("\nElapsed time: " + elapsedTime);

        System.out.println("Insertion Sort:");
        System.out.println("Before sorting...");
        for (int num: a2) {
            System.out.print(num + " ");
        }
        startTime = System.currentTimeMillis();
        InsertionSort.sort(a2);
        stopTime = System.currentTimeMillis();
        elapsedTime = stopTime- startTime;

        System.out.println("\nAfter sorting...");
        for (int num: a2) {
            System.out.print(num + " ");
        }
        System.out.println("\nElapsed time: " + elapsedTime);
    }
}
