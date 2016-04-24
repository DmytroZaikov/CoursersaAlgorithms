package elementarysorts;

import java.util.Random;

public class Client {

    private static int randInt(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }

    public static void main(String[] args){
        int ARRAY_LENGTH = 10;

        Integer[] arrayToBeSorted = new Integer[ARRAY_LENGTH];

        for (int i = 0; i < ARRAY_LENGTH; i++) {
            arrayToBeSorted[i] = randInt(1, 10);
        }

        for (int num: arrayToBeSorted) {
            System.out.print(num + " ");
        }


    }
}
