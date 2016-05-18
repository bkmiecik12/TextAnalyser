/**
 * Created by Bartłomiej on 09.05.2016.
 */

import java.io.*;
import java.util.*;
public class Zad91 {

    static int[] tab= new int[2000]; //tablica znaków
    static String l;

    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("PT.txt");
        Scanner s = new Scanner(file);
        while(s.hasNextLine())
        {
            l = s.nextLine();

            for(int i=0;i<l.length();i++)
            {
                char z =l.charAt(i);
                if(z<97) {
                    z+=32;
                }
                if(z<2000)
                tab[z]++;
            }
        }
        int max=-1;
        String alfabet="aąbcćdeęfghijklłmnńoópqrsśtuvwxyzźż";

        for(int i=0;i<35;i++){
            char x = alfabet.charAt(i);
            if(tab[x]>max) max=tab[x];
        }

        for(int i=0;i<35;i++){
            char x = alfabet.charAt(i);
            System.out.print(x+" "+tab[x]+"\t|");
            int z=(100*tab[x])/max;
            for(int j=0;j<(int)z;j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
