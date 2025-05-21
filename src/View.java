import java.util.ArrayList;

/**
 * Clase encargada de la interacción con el usuario
 */
public class View {
    /**
     * Muestra la velocidad de un coche
     * @param matricula del coche
     * @param v velocidad
     * @return true si se ha mostrado correctamente
     */
    public static boolean muestraVelocidad(String matricula, Integer v){
        System.out.println(matricula + ": " + v + "km/hr");
        return true;
    }

    /**
     * muestra una tabla con los coches y sus datos
     * @param coches arraylist de coches
     * @return true si salio todo correcto
     */
    public static boolean muestraCoches(ArrayList<Coche> coches) {
        System.out.println("Matricula\t\tModelo");
        for (Coche coche :coches) {
            System.out.println(coche.matricula+"\t\t"+coche.modelo);
        }
        return true;
    }
}
