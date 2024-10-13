package LAB2.PB2;

import java.io.*;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) throws FileNotFoundException {
        String filename="C:\\Users\\alexg\\IdeaProjects\\Tema PJ\\src\\cantec_in.txt";
        try (Scanner sc = new Scanner(new File(filename))) {
            OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("cantec_out.txt"));
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] words = line.split(" ");
                int word_number= words.length;


                osw.write(line+" "+word_number+"\n");

            }
            osw.close();
        }
        catch (FileNotFoundException e) {} catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
