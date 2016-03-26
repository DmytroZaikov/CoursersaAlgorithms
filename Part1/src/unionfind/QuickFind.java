package unionfind;

public class QuickFind extends UnionFindBase{

    public QuickFind(int N) {
        super(N);
    }

    public boolean isConnected(int p, int q){
        return id[p] == id[q];
    }

    public void union(int p, int q){

        int pId = id[p];
        int qId = id[q];

        for (int i = 0; i < id.length; i++) {
            if (id[i] == pId){
                id[i] = qId;
            }

        }

    }
}
