package Ex4;

import java.util.Scanner;

public class ex4 {


     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti numarul : ");
        int n = sc.nextInt();
        System.out.print("Divizorii sunt : ");
        boolean prim =true;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                System.out.print(" "+i);
                prim=false;
            }

        }
        if(prim== true)
            System.out.println("Nr Prim");
    }
}
