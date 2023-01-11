public class Main {


    public Main() {
        
        Film film1 = new Film();
        film1.setTitlu("Avatar2");
        film1.getTitlu();
        film1.rating = 7.9;
        film1.potrivitPentruCopii = false;

    }

    public static void main(String[] args) {

//        Book book1 = new Book();
//        int x = 10;
//
//        Car bmw = new Car();
//        Car volvo = new Car();
//        volvo.culoare = "albastru";
//        volvo.anFabricatie = 2022;
//
//        System.out.println(bmw.culoare + "bmw" + bmw.anFabricatie);
//
//        Persoana person1 = new Persoana();
//        System.out.println("Nume:" + person1.nume + " " + person1.prenume);
//        System.out.println("Age");

        Animal giraffe = new Animal();
        giraffe.mananca();
        giraffe.doarme();
        giraffe.afiseaza();

        Animal crocodile = new Animal("Bobo", "verde");
        crocodile.mananca();
        crocodile.doarme();
        crocodile.afiseaza();

        Animal caine = new Animal("Rex", "negru", false, 4);
        Animal papagal = new Animal("Cari", "verde", true, 2);
        Animal caracatita = new Animal("Wohoo", "gri", true, 8);
        caine.afiseazaNrPicioare();
        papagal.afiseazaNrPicioare();
        caracatita.afiseazaNrPicioare();
        caine.setUndeTraieste("pe uscat");
        papagal.setUndeTraieste("in aer");
        caracatita.setUndeTraieste("in apa");
        caine.getUndeTraieste();
        papagal.getUndeTraieste();
        caracatita.getUndeTraieste();

        Film film1 = new Film ();
        film1.titlu = "Avatar2";
        film1.rating = 7.9;
        film1.potrivitPentruCopii = false;
        film1.afiseazaDacaEstePotrivitPentruCopii();


        Film film2 = new Film("Motanul incaltat 2", 2001, 7.1, true);
        System.out.println(film2.rating);
        film2.afiseazaDacaEstePotrivitPentruCopii();
        film2.rating = 8.0;

        System.out.println(film1.anProductie);

        System.out.println(film1.afiseazaRating());
        System.out.println(film2.afiseazaRating());

        Elev elev1 = new Elev ("Pop Andrei");
        Elev elev2 = new Elev ("Ionescu Maria");
        Elev elev3 = new Elev ("Popescu Vlad");
        elev1.diriginte = "Diriginte1";
        elev2.diriginte = "Diriginte2";
        elev3.diriginte = "Diriginte3";

//        elev1.afiseazaElevDiriginte();
//        elev2.afiseazaElevDiriginte();
//        elev3.afiseazaElevDiriginte();

        Inotator inotator1 = new Inotator();
        Maratonist maratonist1 = new Maratonist();
        inotator1.seAntreneaza();
        maratonist1.seAntreneaza();
        inotator1.seOdihneste();
        maratonist1.seOdihneste();

        SmartphoneIOS apple = new SmartphoneIOS();
        SmartphoneAndroid samsung = new SmartphoneAndroid();
        apple.porneste();
        samsung.porneste();
        apple.seOpreste();
        samsung.seOpreste();
    }
}