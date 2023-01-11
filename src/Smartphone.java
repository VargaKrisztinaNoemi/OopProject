public class Smartphone extends Device {

    private String marca = "no name";
    @Override
    void porneste(){
        System.out.println("Telefonul porneste");
    }
    @Override
    void seOpreste(){
        System.out.println("Telefonul se opreste");
    }
}
