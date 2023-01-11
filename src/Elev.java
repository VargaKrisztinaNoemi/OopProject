public class Elev {
    public String nume;
    public static String diriginte;

    public Elev (String nume){
        this.nume = nume;

    }

    public void afiseazaElevDiriginte() {
        System.out.println(this.nume + " are diriginte pe " + diriginte); //nu trebuie this. la diriginte pt ca diriginte se initializeaza impreuna cu clasa avand "static"
        // Abstractizare = modelarea realitatii cu ajutorul claselor, atributelor, metodelor, etc.
        // Incapsulare = ascunderea datelor e.g. private String nume, apoi setNume() si getNume()
        // Mostenirea = mostenirea tuturor elementelor din clasa A (Parinte) in clasa B (Copil): class B extends class A
        // Polimorfism = metode cu acelasi nume dar cu parametri de tip diferit, e.g. runs() si runs(int km) - method overloading
                                                                                //e.g. suprascrierea metodelor - method overriding


    }
}
