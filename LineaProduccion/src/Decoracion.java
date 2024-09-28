import java.util.Scanner;

public class Decoracion extends LineaProduccion {
	public static final int DECORACION = 60;
	
	public Decoracion() {
        super("Decoración");  
    }
	
	public void producir(Scanner scanner) {
            System.out.println("\nLas velas requieren decoración (si/no): ");
            String ponerDecoracion = scanner.next().toLowerCase();
            
            if (ponerDecoracion.equals("si")) {
                String seleccion = seleccionarDecoracion(scanner);
                if (seleccion != null) {
                    System.out.println("\nDecoración seleccionada con éxito.");
                } else {
                    System.out.println("\nNo se aplicará decoración.");
                }
            } else {
                System.out.println("\nNo se agregará decoración. Continuando con la producción.");
                return;
            }

            System.out.println("\n¿Continuar con la decoración? (si/no): ");
            String continuarProduccion = scanner.next().toLowerCase();
            
            if (continuarProduccion.equals("si")) {
                ejecutarProcesoDecoracion();
            } else {
                System.out.println("\nProducción cancelada.");
            }
        }
	
	private String seleccionarDecoracion(Scanner scanner) {
		String[] decoracion = {"Mirella", "Flores", "Copos brillantes"};
        System.out.println("\nSeleccione una decoración");
        for (int i = 0; i < decoracion.length; i++) {
            System.out.println((i + 1) + ". " + decoracion[i]);
        }

        int seleccionColor = scanner.nextInt();
        if (seleccionColor >= 1 && seleccionColor <= decoracion.length) {
            String seleccion = decoracion[seleccionColor - 1];
            mostrarColoresParaDecoracion(scanner, seleccion);
            return seleccion;
        } else {
            System.out.println("\nSelección no válida. No se aplicará decoración.");
            return null;
        }
    }
	
	private void mostrarColoresParaDecoracion(Scanner scanner, String decoracion) {
        String[] colores;
        
        switch (decoracion) {
            case "Mirella":
                colores = new String[]{"Blanca", "Verde", "Azul", "Amarilla", "Rosada", "Roja"};
                break;
            case "Flores":
                colores = new String[]{"Rosadas", "Anaranjadas", "Lilas", "Fucsias", "Amarillas"};
                break;
            case "Copos brillantes":
                colores = new String[]{"Plateado", "Dorado", "Rojo", "Verde", "Azul"};
                break;
            default:
                colores = new String[]{};
        }

        System.out.println("\nSeleccione un color para " + decoracion);
        for (int i = 0; i < colores.length; i++) {
            System.out.println((i + 1) + ". " + colores[i]);
        }

        int seleccionColor = scanner.nextInt();
        if (seleccionColor >= 1 && seleccionColor <= colores.length) {
            System.out.println("\nHa seleccionado el color: " + colores[seleccionColor - 1]);
        } else {
            System.out.println("\nSelección de color no válida. No se aplicará color.");
        }
    }
    
    private void ejecutarProcesoDecoracion() {
    	try {
    		System.out.println("\nDecorando velas...");
			Thread.sleep(2000);
		
			System.out.println("La decoración está lista.");
			Thread.sleep(2000);
		
            System.out.println("\nDecoración finalizada con éxito.");
            Thread.sleep(2000);
            } catch (InterruptedException e) {
            	System.out.println("\nError en la decoración: " + e.getMessage());
	        }
	}
}
