import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\nSeleccione una línea de producción:");
            System.out.println("1. Robótica");
            System.out.println("2. Decoración");
            System.out.println("3. Control de Calidad");
            System.out.println("4. Embalaje");
            System.out.println("5. Salir");

            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                scanner.nextLine();

                LineaProduccion lineaSeleccionada = null;

                switch (opcion) {
                    case 1:
                        lineaSeleccionada = new Robotica();
                        System.out.println("Has seleccionado la línea de producción: Robótica");
                        break;
                    case 2:
                        lineaSeleccionada = new Decoracion();
                        System.out.println("Has seleccionado la línea de producción: Decoración");
                        break;
                    case 3:
                        lineaSeleccionada = new ControlCalidad();
                        System.out.println("Has seleccionado la línea de producción: Control de Calidad");
                        break;
                    case 4:
                        lineaSeleccionada = new Embalaje();
                        System.out.println("Has seleccionado la línea de producción: Embalaje");
                        break;
                    case 5:
                        System.out.println("Saliendo del sistema...");
                        break;
                    default:
                        System.out.println("Opción no válida. Intenta de nuevo.");
                        continue; 
                }

                if (lineaSeleccionada != null) {
                    lineaSeleccionada.iniciarProduccion();
                    lineaSeleccionada.producir();
                }
            } else {
                System.out.println("Entrada no válida. Por favor, ingresa un número.");
                scanner.next();
            }
        } while (opcion != 5);

        scanner.close();
    }
}
