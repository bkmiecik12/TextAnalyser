
import java.io.*;
import java.util.*;
public class Zad93 {

    static int[] tab= new int[100]; //tablica znaków
    static String l;

    public static void main(String[] args) throws FileNotFoundException {

        File file=new File("PT.txt");
        ArrayList<Integer> lista = new ArrayList<>();
        Scanner s = new Scanner(file);

        PrintWriter zapis = new PrintWriter("Zadanie 3.txt");

        while(s.hasNextLine())
        {
            l = s.nextLine();

            StringTokenizer st = new StringTokenizer(l,"! .,\":()-?;");

            while(st.hasMoreTokens()) {
                String r=st.nextToken();
                lista.add(r.length());
            }
        }
        for(int i=0;i<lista.size();i++)
            zapis.println(lista.get(i));

        zapis.close();
    }
}
