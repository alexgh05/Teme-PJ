package LAB2.PB4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class ex4 {


    public static void main(String[] args){

        String CNP;
        int n;
        char c;
        c='a';
        boolean corect=false;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of persons");
        n=sc.nextInt();
        sc.nextLine();
       Vector<Persoana> Persoane=new Vector<>();
        for(int j=1;j<=n;j++){
            CNP="abc";
            System.out.println("Enter the Name");
            String name=sc.nextLine();
        while(CNP.length()!=13||corect==true){
            System.out.print("Enter CNP: ");
            CNP=sc.nextLine();
            int i;
            if(CNP.charAt(0)=='1'||CNP.charAt(0)=='2'||CNP.charAt(0)=='5'||CNP.charAt(0)=='6') {}
                for(i=0;i<CNP.length();i++){
                    if(Character.isLetter(CNP.charAt(i))){
                        corect=true;
                    }
                }

            }
            Persoana p=new Persoana(name,CNP);
            Persoane.add(p);
        }
        for(Persoana p:Persoane){
            System.out.print("Nume "+p.getNume()+" CNP "+p.getCNP()+" Varsta "+p.getVarsta()+"\n");
        }


    }
}
