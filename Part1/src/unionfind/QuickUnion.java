package unionfind;

public class QuickUnion {

    private int[] id;

    public QuickUnion(int N) {

        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    private int root(int elem){

        while( id[elem] != elem){
            elem = id[elem];
        }
        return elem;
    }

    public boolean isConnected(int p, int q){
        return root(p) == root(q);
    }

}
