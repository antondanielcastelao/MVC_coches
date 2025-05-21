public class App {
    public static void main(String[] args) {


        Model.crearCoche("Volvo", "1231241");
        Model.crearCoche("Mercedes", "12312wq");
        Model.crearCoche("Opel", "1232345");

        System.out.println("Muestra los coches");
        View.muestraCoches(Controller.getParking());

        System.out.println("---------");
        System.out.println("Aumenta velocidad volvo en 10 y reduce 5");
        Controller.acelerar(10,"1231241");
        Controller.frenar(5,"1231241");

        View.muestraVelocidad("1231241", Controller.getVelocidad("1231241"));


    }
}
