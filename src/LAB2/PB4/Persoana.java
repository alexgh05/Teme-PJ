package LAB2.PB4;




import java.time.LocalDate;

public class Persoana {
    private String Nume;
    private String CNP;
    public Persoana(String Nume, String CNP) {
        this.Nume = Nume;
        this.CNP = CNP;

    }
    public String getNume() {
        return Nume;
    }
    public String getCNP() {
        return CNP;
    }

    public int getVarsta() {
        LocalDate date=LocalDate.now();

        int Varsta;
        int an_nastere=((int) (CNP.charAt(1)-'0'))*10+((int) (CNP.charAt(2)-'0'));

        if(an_nastere>(date.getYear()%100))
        {
            Varsta=100+(date.getYear()%100)-an_nastere;
        }
        else
        {
            Varsta=(date.getYear()%100)-an_nastere;
        }
        return Varsta;
    }
}
