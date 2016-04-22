package unionfind;

public class QuickUnionPathCompression extends UnionFindBase {

    public QuickUnionPathCompression(int N){
        super(N);
    }

    private int root(int node){

        while(id[node] != node){
            id[node] = id[id[node]];
            node = id[node];
        }
        return node;
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