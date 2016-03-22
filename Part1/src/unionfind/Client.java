package unionfind;

import java.io.Console;

/**
 * Created by Dmytro on 3/22/2016.
 */
public class Client {

    public static void main(String[] args){

        Console cnsl = System.console();
        int N = Integer.parseInt(cnsl.readLine());

        QuickFind qf = new QuickFind(N);


    }

}
