import java.util.*;
import java.io.*;

/**
 * Created by Bartłomiej on 09.05.2016.
 */
public class Zad92 {

    public static void main(String[] args) throws FileNotFoundException{

        Random r = new Random();
        PrintWriter zapis = new PrintWriter("Gauss.txt");
        for(int i=0;i<5000;i++)
        {
            double x= r.nextGaussian()*2 + 3;
            zapis.println((int)x);
        }
        zapis.close();
    }


}
