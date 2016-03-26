package unionfind;

public class QuickUnion extends UnionFindBase {

    public QuickUnion(int N){
        super(N);
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

        id[rootP] = rootQ;
    }

}
