public class Animal {

    String nume;
    String culoare;
    boolean vegetarian;

    int nrPicioare;

    public void mananca(){
        System.out.println(nume + " mananca");
    }

    public void doarme(){
        System.out.println(nume + " doarme");
    }

    public String afiseaza(){
        String concatenated = nume + " are culoarea " + culoare;
        System.out.println(concatenated);
        return concatenated;
    }

    public void afiseazaNrPicioare(){
        if (this.nrPicioare == 0) {
            System.out.println(this.nume + " nu are picioare");
        } else if (this.nrPicioare == 2) {
            System.out.println(this.nume + " are 2 picioare");
        } else if (this.nrPicioare == 4) {
            System.out.println(this.nume + " are 4 picioare");
        } else {
            System.out.println(this.nume + " are alt numar de picioare");
        }
    }

    public Animal() {
        this.nume = "unknown";
        this.culoare = "grey";
        this.vegetarian = false;
    }

    public Animal(String nume) {
        this.nume = nume;
    }

    public Animal(String nume, String culoare) {
        this.nume = nume;
        this.culoare = culoare;
    }

    public Animal(String nume, String culoare, boolean vegetarian, int nrPicioare) {
        this.nume = nume;
        this.culoare = culoare;
        this.vegetarian = vegetarian;
        this.nrPicioare = nrPicioare;
    }

}
