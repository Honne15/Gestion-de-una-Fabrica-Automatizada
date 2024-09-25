import java.util.Scanner;

public class Robotica extends LineaProduccion {

    public Robotica() {
        super("Robótica");  
    }

    @Override
    public void producir() {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("\nIngrese el diámetro del envase (cm): ");
			double diametro = scanner.nextDouble();

			String pabilo = determinarPabilo(diametro);
			System.out.println("El pabilo a utilizar es: " + pabilo);

			System.out.println("\nIngrese cuánto cabe en el envase (gr): ");
			double capacidadVela = scanner.nextDouble();

			System.out.println("\nIngrese la cantidad de envases que se van a producir: ");
			int cantidadEnvases = scanner.nextInt();
			
			System.out.println("\n¿Desea poner colorante? (si/no): ");
			String ponerColorante = scanner.next().toLowerCase();
			
			if (ponerColorante.equals("si")) {
				String[] colores = {"Rojo", "Verde", "Rosado", "Morado", "Azul"};
				System.out.println("\nSeleccione un colorante");
				for (int i = 0; i < colores.length; i++) {
			        System.out.println((i + 1) + ". " + colores[i]);
			    }

			    int seleccionColor = scanner.nextInt();
			    if (seleccionColor >= 1 && seleccionColor <= colores.length) {
			        System.out.println("\nHa seleccionado el color: " + colores[seleccionColor - 1]);
			    } else {
			        System.out.println("\nSelección no válida. No se agregará colorante.");
			    }
			} else {
			    System.out.println("\nNo se agregará colorante.");
			}

			calcularMateriales(capacidadVela, cantidadEnvases);
			
			String continuarProduccion;
            do {
                System.out.println("\n¿Continuar con la producción? (si/no): ");
                continuarProduccion = scanner.next().toLowerCase();
        
                if (continuarProduccion.equals("si")) {
                    try {
                        System.out.println("\nIniciando producción...");
                        Thread.sleep(2000);
                        
                        System.out.println("\nCortando pabilos...");
                        Thread.sleep(2000);
                
                        System.out.println("Preparando pabilos con la chapeta...");
                        Thread.sleep(2000);
                        
                        System.out.println("Pegando pabilos en los envases...");
                        Thread.sleep(2000);
                
                        System.out.println("Derritiendo cera...");
                        Thread.sleep(2000);
                
                        System.out.println("Agregando vybar...");
                        Thread.sleep(2000);
                
                        System.out.println("Revolviendo para disolverlo en la cera...");
                        Thread.sleep(2000);
                
                        System.out.println("Agregando esencia...");
                        Thread.sleep(2000);
                
                        System.out.println("Revolviendo para mezclarlo con la cera y el vybar...");
                        Thread.sleep(2000);
                
                        if (ponerColorante.equals("si")) {
                            System.out.println("Agregando colorante...");
                            Thread.sleep(2000);
                        } else {
                            System.out.println("No se agregará colorante.");
                            Thread.sleep(1000);
                        }
                
                        System.out.println("La preparación está lista.");
                        Thread.sleep(1000);
                
                        System.out.println("Vertiendo la cera en los envases...");
                        Thread.sleep(2000);
                
                        System.out.println("Producción finalizada con éxito.");
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        System.out.println("Error en la producción: " + e.getMessage());
                    }
                } else {
                    System.out.println("Producción cancelada.");
                }
            } while (continuarProduccion.equals("si"));
        }
    }

    private String determinarPabilo(double diametro) {
        if (diametro >= 1 && diametro <= 2) {
            return "Pabilo 6";
        } else if (diametro > 2 && diametro <= 4) {
            return "Pabilo 9";
        } else if (diametro > 4 && diametro <= 5) {
            return "Pabilo 12";
        } else if (diametro > 5 && diametro <= 6) {
            return "Pabilo 15";
        } else if (diametro > 6 && diametro <= 7) {
            return "Pabilo 18";
        } else if (diametro > 7 && diametro <= 9) {
            return "Pabilo 21";
        } else {
            return "Pabilo no disponible para esas medidas.";
        }
    }

    private void calcularMateriales(double capacidadVela, int cantidadEnvases) {
 
        double cantidadCera = capacidadVela * 0.9 * cantidadEnvases; 
        double cantidadEsencia = capacidadVela * 0.08 * cantidadEnvases; 
        double cantidadVybar = capacidadVela * 0.02 * cantidadEnvases;

        System.out.println("Para " + cantidadEnvases + " velas, se necesitan:");
        System.out.println("Cera: " + cantidadCera + " gramos.");
        System.out.println("Esencia: " + cantidadEsencia + " gramos.");
        System.out.println("Vybar: " + cantidadVybar + " gramos.");
    }
 }




