public class Gyerek {

    String nev;

    public void alszik() {
        System.out.println(nev + " alszik");
    }

    public void sir() {
        System.out.println(nev + " sir");
    }

    public void biciklizik() {
        System.out.println(nev + " biciklizik");
    }

    public Gyerek(String nev) {
        this.nev = nev;
    }
}