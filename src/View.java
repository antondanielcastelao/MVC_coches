import java.util.ArrayList;
import java.util.Scanner;

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

    /**
     * funcion para el menu
     */
    public static void menu() {

        Scanner sc = new Scanner(System.in);
        int opt = 0;    // opcion en el menu seleccionada


        while (opt != 99) {
            System.out.println("---------------------");
            System.out.println("Menu:");
            System.out.println("1. Crear coche");
            System.out.println("2. Acelerar");
            System.out.println("3. Frenar");
            System.out.println("4. Mostrar velocidad");
            System.out.println("5. Mostrar coches");
            System.out.println("---------------------");
            opt = sc.nextInt();

            String mat; // matricula del coche (si hace falta)
            String mod; // modelo del coche ....
            int v;      // velocidad ....

            switch (opt) {
                case 1: // crear coche
                    System.out.println("Modelo: ");
                    mod = sc.nextLine();
                    System.out.println("Matricula: ");
                    mat = sc.nextLine();

                    Model.crearCoche(mod,mat);

                    break;
                case 2: // acelerar
                    System.out.println("Matricula del coche:");
                    mat = sc.nextLine();
                    System.out.println("Velocidad a acelerar:");
                    v = sc.nextInt();
                    Controller.acelerar(v, mat);
                    break;
                case 3: // frenar
                    System.out.println("Matricula del coche:");
                    mat = sc.nextLine();
                    System.out.println("Velocidad a acelerar:");
                    v = sc.nextInt();
                    Controller.frenar(v, mat);
                    break;
                case 4: // mostrar velocidad
                    System.out.println("Matricula del coche:");
                    mat = sc.nextLine();
                    View.muestraVelocidad(mat, Controller.getVelocidad(mat));
                    break;
                case 5: // mostra coches
                    View.muestraCoches(Controller.getParking());
                    break;
                default:
                    System.out.println("Non valido");
            }
        }
    }
}
