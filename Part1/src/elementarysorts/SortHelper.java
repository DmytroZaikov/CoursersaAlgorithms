package elementarysorts;

public class SortHelper {

    public static boolean isLess(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }

    public static void swap(Comparable[] a, int i, int j){
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
