public class Film {
    protected String titlu;
    int anProductie;
    double rating;
    boolean potrivitPentruCopii;

    public String unText = "Toate filmele sunt frumoase";

    public void afiseazaDacaEstePotrivitPentruCopii(){
        if (this.potrivitPentruCopii){
            System.out.println("Filmul este potrivit pentru copii");
        }
        else {
            System.out.println("Filmul nu este potrivit pentru copii");
        }
    }

    public Film() {
        this.titlu = "unknown";
        this.anProductie = 2000;
        this.rating = 10;
        this.potrivitPentruCopii = false;

    }




    public String afiseazaRating() {
        return this.titlu + " are rating " + this.rating;

    }

    public Film(String titlu, int anProductie, double rating, boolean potrivitPentruCopii) {
        this.titlu = titlu;
        this.anProductie = anProductie;
        this.rating = rating;
        this.potrivitPentruCopii = potrivitPentruCopii;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public int getAnProductie() {
        return anProductie;
    }

    public void setAnProductie(int anProductie) {
        this.anProductie = anProductie;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public boolean isPotrivitPentruCopii() {
        return potrivitPentruCopii;
    }

    public void setPotrivitPentruCopii(boolean potrivitPentruCopii) {
        this.potrivitPentruCopii = potrivitPentruCopii;
    }

    public String getUnText() {
        return unText;
    }

    public void setUnText(String unText) {
        this.unText = unText;
    }
}



