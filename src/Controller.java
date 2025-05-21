import java.lang.module.ModuleDescriptor;

public class Controller {
    static View miView = new View();
    static Model miModel = new Model();

    public static void main(String[] args) {
        // Instanciamos la vista y el modelo


        // Crear tres coches
        miModel.crearCoche("LaFerrari", "SBC 1234");
        miModel.crearCoche("Alpine", "HYU 4567");
        miModel.crearCoche("Aston Martin", "FGH 3333");

        Coche ferrari = miModel.getCoche("SBC 1234");
        // modifica la velocidad
        int nuevaVelocidad = miModel.cambiarVelocidad("SBC 1234", 30);

        // recoje la velocidad y la muestra (tarea de la View)
        boolean hecho = miView.muestraVelocidad("SBC 1234", miModel.getVelocidad("SBC 1234"));

        if (hecho) {
            System.out.println("Correcto");
        } else {
            System.out.println("Error");
        } ;
    }

    /**
     * aumenta la velocidad de un coche
     * @param v belocidad a acelerar
     * @param matricula matricula del choce
     * @return velocidad nueva del coche
     */
    public int acelerar(Integer v, String matricula) {
        int vactual = miModel.getVelocidad(matricula);
        miModel.cambiarVelocidad(matricula, (v + vactual));
        return miModel.getVelocidad(matricula);
    }

    /**
     * baja la velocidad d un coche
     * @param v velocidad a disminur
     * @param matricula matricula del coche
     * @return velocidad nueva del coche
     */
    public int frenar(Integer v, String matricula) {
        int vactual = miModel.getVelocidad(matricula);
        miModel.cambiarVelocidad(matricula, (v - vactual));
        return miModel.getVelocidad(matricula);
    }

}