package LAB2.PB3;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        String sir1,sir2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduceti sirul 1: ");
        sir1 = sc.nextLine();
        System.out.print("Introduceti sirul 2: ");
        sir2 = sc.nextLine();
        int poz ;
        System.out.print("Introduceti pozitia de adaugare: ");
        poz = sc.nextInt();
        String siruriadaugate =new StringBuilder(sir1).insert(poz,sir2).toString();
        System.out.println(siruriadaugate);
        System.out.println("\nIntroduceti pozitia de inceput a stergerii: ");
        poz = sc.nextInt();
        int nrelemsterse;
        System.out.print("Introduceti  nr elemente sterse: ");
        nrelemsterse = sc.nextInt();
        String siruristerse=new StringBuilder(sir1).delete(poz,poz+nrelemsterse).toString();
        System.out.println(siruristerse);
    }
}
