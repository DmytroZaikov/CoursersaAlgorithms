package unionfind;

abstract class UnionFindBase {

    protected int[] id;

    public  UnionFindBase(int N){
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    public void prettyPrint(){

        for (int i = 0; i < id.length; i++) {
            System.out.print(i + " | ");
        }
        System.out.println();
        for (int anId : id) {
            System.out.print(anId + " | ");
        }
        System.out.println();

        }

    public abstract boolean isConnected(int p, int q);
    public abstract void union(int p, int q);

}
