import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        Robotica robotica = null;
        Reutilizacion reutilizacion = null;

        do {
            System.out.println("\nSeleccione una línea de producción:");
            System.out.println("1. Robótica");
            System.out.println("2. Decoración");
            System.out.println("3. Control de Calidad");
            System.out.println("4. Reutilización");
            System.out.println("5. Control de calidad de la Reutilización");
            System.out.println("6. Embalaje");
            System.out.println("7. Salir");

            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                scanner.nextLine();

                LineaProduccion lineaSeleccionada = null;

                switch (opcion) {
                    case 1:
                        robotica = new Robotica(); 
                        lineaSeleccionada = robotica;
                        break;
                    case 2:
                        lineaSeleccionada = new Decoracion();
                        break;
                    case 3:
                        if (robotica == null) {
                            System.out.println("Primero debes producir en la línea de Robótica.");
                            continue;
                        }
                        lineaSeleccionada = new ControlCalidad(robotica); 
                        break;
                    case 4:
                    	reutilizacion = new Reutilizacion();
                        lineaSeleccionada = reutilizacion;
                        break;
                    case 5:
                    	 if (reutilizacion == null) {
                             System.out.println("Primero debes producir en la línea de Robótica.");
                             continue;
                         }
                        lineaSeleccionada = new ControlReutilizados(reutilizacion);
                        break;
                    case 6:
                        lineaSeleccionada = new Embalaje();
                        break;
                    case 7:
                        System.out.println("\nSaliendo del sistema...");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
                        System.out.println("\nHas salido del sistema.");
                        break;
                    default:
                        System.out.println("\nOpción no válida. Intenta de nuevo.");
                        continue; 
                }

                if (lineaSeleccionada != null) {
                    lineaSeleccionada.iniciarProduccion();
                    lineaSeleccionada.producir(scanner); 
                }
            } else {
                System.out.println("\nEntrada no válida. Por favor, ingresa un número.");
                scanner.next(); 
            }
        } while (opcion != 7);

        scanner.close();
    }
}
