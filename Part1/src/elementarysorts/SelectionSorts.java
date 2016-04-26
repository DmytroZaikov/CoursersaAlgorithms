package elementarysorts;

import static elementarysorts.SortHelper.isLess;
import static elementarysorts.SortHelper.swap;

public class SelectionSorts {

    public static void sort(Comparable[] a){

        int arraySize = a.length;

        for (int i = 0; i < arraySize; i++) {

            int min = i;

            for (int j = i+1; j < arraySize; j++) {
                if(isLess(a[j], a[min])){
                    min = j;
                }
            }
            swap(a, i, min);

        }

    }
}
