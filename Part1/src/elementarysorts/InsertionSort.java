package elementarysorts;

import static elementarysorts.SortHelper.isLess;
import static elementarysorts.SortHelper.swap;

public class InsertionSort {
    public static void sort(Comparable[] a){

        int N = a.length;

        for (int i = 0; i < N; i++)
            for (int j = i; j > 0; j--) {
                if (isLess(a[j], a[j - 1])) {
                    swap(a, j, j-1);
                }
                else{
                    break;
                }

            }


    }
}
