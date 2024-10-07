package LAB2.PB1;


import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        String[] judet;

        int i = 0;
        try {
            Scanner sc = new Scanner(new File("C:/Users/alexg/IdeaProjects/Tema PJ/judete_in.txt"));
            while(sc.hasNextLine())
            {
                i++;
                sc.nextLine();
            }

        }catch (Exception e){}
        judet=new String[i];
        Scanner scanner;
        try {
            scanner = new Scanner(new File("C:\\Users\\alexg\\IdeaProjects\\Tema PJ\\judete_in.txt"));
        i=0;
        while (scanner.hasNextLine()) {
            judet[i] = scanner.nextLine();
            System.out.print(judet[i]+"\n");
            i++;
        }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Arrays.sort(judet);
        try{Scanner scan = new Scanner(System.in);
        String judetdorit;
        judetdorit=scan.nextLine();
        int poz=-1;
        poz= Arrays.binarySearch(judet,judetdorit);
        System.out.println("\n"+(poz+1));} catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
