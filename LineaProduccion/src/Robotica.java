import java.util.Scanner;

public class Robotica extends LineaProduccion {

    public Robotica() {
        super("Robótica");  
    }

    @Override
    public void producir() {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Ingrese el diámetro del envase (cm): ");
			double diametro = scanner.nextDouble();

			String pabilo = determinarPabilo(diametro);
			System.out.println("El pabilo a utilizar es: " + pabilo);

			System.out.println("Ingrese cuánto cabe en el envase (gr): ");
			double capacidadVela = scanner.nextDouble();

			System.out.println("Ingrese la cantidad de envases que se van a producir: ");
			int cantidadEnvases = scanner.nextInt();
			
			System.out.println("¿Desea poner colorante? (si/no): ");
			String ponerColorante = scanner.next().toLowerCase();
			
			if (ponerColorante.equals("si")) {
				String[] colores = {"Rojo", "Verde", "Rosado", "Morado", "Azul"};
				System.out.println("Seleccione un colorante");
				for (int i = 0; i < colores.length; i++) {
			        System.out.println((i + 1) + ". " + colores[i]);
			    }

			    int seleccionColor = scanner.nextInt();
			    if (seleccionColor >= 1 && seleccionColor <= colores.length) {
			        System.out.println("Ha seleccionado el color: " + colores[seleccionColor - 1]);
			    } else {
			        System.out.println("Selección no válida. No se aplicará colorante.");
			    }
			} else {
			    System.out.println("No se agregará colorante. Continuando con la producción.");
			}
			

			calcularMateriales(capacidadVela, cantidadEnvases);
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

        System.out.println("Para " + cantidadEnvases + " envases, se necesitan:");
        System.out.println("Cera: " + cantidadCera + " gramos.");
        System.out.println("Esencia: " + cantidadEsencia + " gramos.");
        System.out.println("Vybar: " + cantidadVybar + " gramos.");
    }
}


