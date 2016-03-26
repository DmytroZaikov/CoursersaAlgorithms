package unionfind;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Client {

    public static void main(String[] args){

        try {
            Scanner sc = new Scanner(new File("numbers.txt"));
            while (sc.hasNextInt()){
                System.out.println(sc.nextInt() + " ");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
