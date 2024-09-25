import java.util.Scanner;

public class Reutilizacion extends LineaProduccion{
	private int cantidadReutilizados;
	
	public Reutilizacion() {
        super("Reutilización");
    }

    @Override
    public void producir(Scanner scanner) {
     
        System.out.println("\nIngrese la cantidad de velas ha reutilizar: ");
        cantidadReutilizados = scanner.nextInt();

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

                    System.out.println("Vertiendo la cera en los envases...");
                    Thread.sleep(2000);

                    System.out.println("Producción finalizada con éxito.");
                    Thread.sleep(2000);
                    return;
                } catch (InterruptedException e) {
                    System.out.println("\nError en la producción: " + e.getMessage());
                }
            } else {
                System.out.println("\nProducción cancelada.");
            }
        } while (continuarProduccion.equalsIgnoreCase("si"));
    }

    public int getCantidadReutilizados() {
        return cantidadReutilizados; 
    }

}
