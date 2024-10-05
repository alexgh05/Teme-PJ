package Ex3;

import java.util.Scanner;

public class ex3 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Lungime: ");
        float Lungime = sc.nextFloat();
        System.out.print("Latime: ");
        float Latime = sc.nextFloat();
        float Perimetru=2*(Lungime+Latime);
        float Aria=Lungime*Latime;
        System.out.println("Perimetru: "+Perimetru);
        System.out.println("Aria: "+Aria);
    }
}
