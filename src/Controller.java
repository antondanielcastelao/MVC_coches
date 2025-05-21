import java.lang.module.ModuleDescriptor;
import java.util.ArrayList;

public class Controller {

    /**
     * Cambia la velocidad de un coche
     * @param matricula
     * @param v nueva velocidad
     * @return velocidad modificada
     */
    public static int cambiarVelocidad(String matricula, Integer v) {
        // busca el coche
        Model.getCoche(matricula).velocidad = v;
        // retorna la nueva velocidad
        return Model.getCoche(matricula).velocidad;
    }

        /**
     * aumenta la velocidad de un coche
     * @param v belocidad a acelerar
     * @param matricula matricula del choce
     * @return velocidad nueva del coche
     */
    public static int acelerar(Integer v, String matricula) {
        int vactual = getVelocidad(matricula);
        cambiarVelocidad(matricula, (v + vactual));
        return getVelocidad(matricula);
    }

    /**
     * baja la velocidad d un coche
     * @param v velocidad a disminur
     * @param matricula matricula del coche
     * @return velocidad nueva del coche
     */
    public static int frenar(Integer v, String matricula) {
        int vactual = getVelocidad(matricula);
        cambiarVelocidad(matricula, (vactual - v));
        return getVelocidad(matricula);
    }

    /**
     * obtiene listado de coches
     * @return coches
     */
    public static ArrayList<Coche> getParking() {
        return Model.parking;
    }

    /**
     * Ddevuelve la velocidad segun la matricula
     * @param matricula
     * @return
     */
    public static int getVelocidad(String matricula) {
        return Model.getCoche(matricula).velocidad;
    }

}