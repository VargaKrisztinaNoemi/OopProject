public class ValoElet {

    public static void main(String[] args) {

        Gyerek elsoGyerek = new Gyerek("Leila");

        Gyerek masodikGyermek = new Gyerek("Lajos");

        Gyerek harmadikGyerek = new Gyerek("Menyhart");

        elsoGyerek.alszik();
        elsoGyerek.sir();
        elsoGyerek.biciklizik();

        masodikGyermek.alszik();
        masodikGyermek.sir();
        masodikGyermek.biciklizik();

        harmadikGyerek.alszik();
        harmadikGyerek.sir();
        harmadikGyerek.biciklizik();
    }
}
