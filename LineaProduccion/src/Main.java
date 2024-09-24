
import java.util.Scanner;

public class Main {
    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione una línea de producción:");
        System.out.println("1. Robótica");
        System.out.println("2. Decoración");
        System.out.println("3. Control de Calidad");
        System.out.println("4. Embalaje");

        int opcion = scanner.nextInt();

        LineaProduccion lineaSeleccionada = null;

        switch (opcion) {
            case 1:
                lineaSeleccionada = new Robotica();
                break;
            case 2:
                lineaSeleccionada = new Decoracion();
                break;
            case 3:
                lineaSeleccionada = new ControlCalidad();
                break;
            case 4:
                lineaSeleccionada = new Embalaje();
                break;
            default:
                System.out.println("Opción no válida.");
                return;
        }

        if (lineaSeleccionada != null) {
            lineaSeleccionada.iniciarProduccion();
            lineaSeleccionada.producir();
        }
        
        scanner.close();
     
    }
    
    
}

