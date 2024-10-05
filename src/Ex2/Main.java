package Ex2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        int x, nr = 0, sum = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, ma = 0;
        String filename = "C:/Users/alexg/IdeaProjects/Tema PJ/in.txt";
        try {
            Scanner sc = new Scanner(new File(filename));
            while (sc.hasNextInt()) {
                nr++;
                x = sc.nextInt();
                sum = sum + x;
                min = Math.min(min, x);
                max = Math.max(max, x);
                ma = (ma + x) / nr;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        try (FileWriter file = new FileWriter("Out.txt")) {
            file.write(sum+"\n");
            file.write(min+"\n");
            file.write(max+"\n");
            file.write(ma+"\n");
        }

    }
}

