package unionfind;

public class QuickUnionWeighted extends UnionFindBase {
    private int[] sz; //Amount of elements under the root

    public QuickUnionWeighted(int N){
        super(N);
        sz = new int[N];
        for (int i = 0; i < N; i++) {
            sz[i] = 1;
        }
    }

    private int root(int elem){
        while(id[elem] != elem){
            elem = id[elem];
        }
        return elem;
    }

    public boolean isConnected(int p, int q){
        return root(p) == root(q);
    }

    public void union(int p, int q){
        int rootP = root(p);
        int rootQ = root(q);
        if(sz[rootP] < sz[rootQ]){
            id[rootP] = rootQ;
            sz[rootQ] += sz[rootP];
        } else {
            id[rootQ] = rootP;
            sz[rootP] += sz[rootQ];
        }
    }
}