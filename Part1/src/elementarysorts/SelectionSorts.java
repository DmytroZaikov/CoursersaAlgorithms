package elementarysorts;

import static elementarysorts.SortHelper.isLess;
import static elementarysorts.SortHelper.swap;

public class SelectionSorts {

    public static void sort(Comparable[] a){

        int N = a.length;

        for (int i = 0; i < N; i++) {

            int min = i;

            for (int j = i+1; j < N; j++) {
                if(isLess(a[j], a[min])){
                    min = j;
                }
            }
            swap(a, i, min);

        }

    }
}
