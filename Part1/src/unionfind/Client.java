package unionfind;

public class Client {

    public static void main(String[] args){

//        try {
//            Scanner sc = new Scanner(new File("numbers.txt"));
//            while (sc.hasNextInt()){
//                //System.out.println(sc.nextInt() + " ");
//            }
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

        QuickFind quickFind = new QuickFind(10);
        QuickUnion quickUnion = new QuickUnion(10);
        QuickUnionWeighted quickUnionWeighted = new QuickUnionWeighted(10);

        //Setup for Quick Find task
        quickFind.union(4,3);
        quickFind.union(3,8);
        quickFind.union(6,5);
        quickFind.union(9,4);
        quickFind.union(2,1);
        quickFind.union(5,0);
        quickFind.union(7,2);
        quickFind.union(6,1);

        //Setup for Quick Union task
        quickUnion.union(4,3);
        quickUnion.union(3,8);
        quickUnion.union(6,5);
        quickUnion.union(9,4);
        quickUnion.union(2,1);
        quickUnion.union(5,0);
        quickUnion.union(7,2);
        quickUnion.union(6,1);
        quickUnion.union(7,3);

        //Setup for Quick Union Weighted task
        quickUnionWeighted.union(4,3);
        quickUnionWeighted.union(3,8);
        quickUnionWeighted.union(6,5);
        quickUnionWeighted.union(9,4);
        quickUnionWeighted.union(2,1);
        quickUnionWeighted.union(5,0);
        quickUnionWeighted.union(7,2);
        quickUnionWeighted.union(6,1);
        quickUnionWeighted.union(7,3);

        quickFind.prettyPrint();
        System.out.println();
        quickUnion.prettyPrint();
        System.out.println();
        quickUnionWeighted.prettyPrint();

    }

}
