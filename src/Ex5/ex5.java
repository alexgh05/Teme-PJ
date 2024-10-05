package Ex5;

import java.util.Random;

public class ex5 {
    public static void main(String[] args) {

        int a,b;
        Random rand = new Random();
        rand.setSeed(123456890);
        a=rand.nextInt(30);
        b=rand.nextInt(30);
        System.out.println("\n"+a+"\n");
        System.out.println(b);
        int min=Math.min(a,b);
        boolean cmmdc =false;
        for(int i=min;i>1;i--){
            if((a%i)==0&&(b%i)==0){
            cmmdc=true;
            System.out.print(i+" este cmmdc ");
            break;}
        }
    }
}
