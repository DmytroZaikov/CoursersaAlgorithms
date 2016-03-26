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

}
