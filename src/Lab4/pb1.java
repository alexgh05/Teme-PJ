package Lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class pb1 {
    enum en{achiziţionat,expus,vandut}
    enum mt{alb_negru,color}
    enum tipFoaie{a3,a4}
    enum SO{Linux,Windows}

    public static class Echipament {

        String denumire;
        int nr_inv;
        int pret;
        en zona;
        String zona_mag;

        void Afisare(){}

        void modif_stare(en zona){
            this.zona = zona;
        }
    };
    static class Imprimanta extends Echipament {
        int ppm;
        String dpi;
        int P_car;
        mt mod_tiparire;

        Imprimanta(String denumire,int nr,int pret,en zon,int ppm, String dpi, int P_car, mt mod_tiparire,String zona_mag) {
            this.ppm = ppm;
            this.dpi = dpi;
            this.P_car = P_car;
            this.mod_tiparire = mod_tiparire;
            this.zona = zon;
            this.denumire = denumire;
            this.nr_inv = nr;
            this.pret = pret;
            this.zona_mag = zona_mag;

        }

        public void Afisare()
        {
            System.out.println(denumire+"\n");
            System.out.println(nr_inv+"\n");
            System.out.println(pret+"\n");
            System.out.println(zona+"\n");
            System.out.println(mod_tiparire+"\n");
            System.out.println(P_car+"\n");
            System.out.println(dpi+"\n");
            System.out.println(ppm+"\n");
            System.out.println(zona_mag+"\n");
        }
    };


    static class Copiator extends Echipament {
      int P_ton;
      tipFoaie mod_tiparire;
      Copiator(String denumire,int nr,int pret,en zon,int P_ton, tipFoaie mod_tiparire,String zona_mag) {
          this.P_ton = P_ton;
          this.mod_tiparire = mod_tiparire;
          this.zona = zon;
          this.denumire = denumire;
          this.nr_inv = nr;
          this.pret = pret;
          this.zona_mag = zona_mag;
      }

      public void Afisare()
      {
          System.out.println(denumire+"\n");
          System.out.println(mod_tiparire+"\n");
          System.out.println(zona+"\n");
          System.out.println(pret+"\n");
          System.out.println(P_ton+"\n");
          System.out.println(mod_tiparire+"\n");
          System.out.println(nr_inv+"\n");

            System.out.println(zona_mag+"\n");
      }
    };

    static class SistemCalcul extends Echipament {

        String tip_monitor;
        float vit_procesare;
        int capacitate_HDD;
        SO Sist_Operare;

        SistemCalcul(String denumire,int nr,int pret,en zon,String tip_monitor, float vit_procesare, int capacitate_HDD,SO Sist_Operare,String zona_mag) {
            this.tip_monitor = tip_monitor;
            this.vit_procesare = vit_procesare;
            this.capacitate_HDD = capacitate_HDD;
            this.Sist_Operare = Sist_Operare;
            this.zona = zon;
            this.denumire = denumire;
            this.nr_inv = nr;
            this.pret = pret;
            this.zona_mag = zona_mag;

        }

        public void Afisare()
        {
            System.out.println(denumire+"\n");
            System.out.println(nr_inv+"\n");
            System.out.println(pret+"\n");
            System.out.println(zona+"\n");
            System.out.println(tip_monitor+"\n");
            System.out.println(vit_procesare+"\n");
            System.out.println(capacitate_HDD+"\n");
            System.out.println(Sist_Operare+"\n");
            System.out.println(zona_mag+"\n");
        }
    };

    public static void main(String[] args) throws FileNotFoundException {
        List<Echipament> Echipamente = new ArrayList<>();

        String filename = "C:\\Users\\alexg\\IdeaProjects\\Tema PJ\\src\\echipamente.txt";

        Scanner scanner = new Scanner(new File(filename));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] tokens = line.split(";");
            String denumire = tokens[0];
            int nr_inv = Integer.parseInt(tokens[1]);
            int pret = Integer.parseInt(tokens[2]);
            String zona_mag = tokens[3];
            en zona;
            if(tokens[4]=="achizitionat") {
                 zona=en.achiziţionat;
            }
            else if(tokens[4]=="expus") {
                 zona=en.expus;
            }
            else{
                 zona=en.vandut;
            }
            String produs = tokens[5];
            String imp="imprimanta";
            if (Objects.equals(produs, "imprimanta")) {
                int ppm = Integer.parseInt(tokens[6]);
                String dpi = tokens[7];
                int P_car = Integer.parseInt(tokens[8]);
                mt mod_tiparire;
                if(tokens[9]=="Color") {
                    mod_tiparire = mt.color;
                }else {
                     mod_tiparire=mt.alb_negru;
                }
                Imprimanta Im = new Imprimanta(denumire, nr_inv, pret, zona, ppm, dpi, P_car, mod_tiparire, zona_mag);
                Echipamente.add(Im);
            } else if (Objects.equals(produs , "copiator")) {
                int P_ton = Integer.parseInt(tokens[6]);
                tipFoaie tip;
                if(tokens[7]=="A3") {
                    tip = tipFoaie.a3;
                }
                else {
                    tip=tipFoaie.a4;
                }
                Copiator cp = new Copiator(denumire, nr_inv, pret, zona, P_ton, tip,zona_mag);
                Echipamente.add(cp);
            } else if (Objects.equals(produs ,"sistem de calcul") ){
                String tip_monitor = tokens[6];
                float vit_procesare = Float.parseFloat(tokens[7]);
                int capacitate_HDD = Integer.parseInt(tokens[8]);
                SO sist_Operare;
                if(tokens[9]=="windows") {
                    sist_Operare= SO.Windows;
                }
                else {
                    sist_Operare=SO.Linux;
                }

                SistemCalcul Sc = new SistemCalcul(denumire, nr_inv, pret, zona, tip_monitor, vit_procesare, capacitate_HDD, sist_Operare,zona_mag);
                Echipamente.add(Sc);
            }

        }

        int optiune;
        System.out.print("Introduceti optiunea");
        Scanner scanner1 = new Scanner(System.in);
        optiune=scanner1.nextInt();
        switch (optiune)
        {

            case 1:
                for (Echipament e:Echipamente)
                {
                    e.Afisare();
                }
                break;

                case 2:
                    for(Echipament i:Echipamente)
                    {
                        if(i.getClass()==Imprimanta.class)
                        i.Afisare();
                    }
                    break;
                    case 3:
                        for (Echipament e:Echipamente)
                        {
                            if (e.getClass()==Copiator.class)
                                e.Afisare();
                        }
                        break;
                        case 4:
                            for(Echipament e:Echipamente)
                            {
                                if(e.getClass()==SistemCalcul.class)
                                    e.Afisare();
                            }
                            break;

                            case 5:
                                System.out.print("Introduceti starea 1.Vandut 2.Expus3.Achizitionat");
                                Scanner scanner2 = new Scanner(System.in);
                                optiune=scanner2.nextInt();
                                switch (optiune)
                                {
                                    case 1:

                                }


        }

    }


}
