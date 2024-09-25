import java.util.Scanner;

public class ControlCalidad extends LineaProduccion{
	
	public ControlCalidad() {
        super("Control de Calidad");  
    }
	
	@Override
	public void producir() {
        int cantidadVelasBuenas = 0;
		try (Scanner scanner = new Scanner(System.in)) {
			
			    System.out.println("\nIniciando Control de Calidad...");
			    Thread.sleep(2000);System.out.println("\n¿Cuántas velas se encuentran quebradas?: ");
			    int velasQuebradas = scanner.nextInt();
			    
			    System.out.println("\n¿Cuántas velas se encuentran sucias?: ");
			    int velasSucias = scanner.nextInt();
			    
			    System.out.println("\n¿Cuántas velas tienen la decoración (flores) cerca al pabilo?: ");
			    int velasPabilo = scanner.nextInt();
			    
			    System.out.println("\n¿Cuántas velas tienen rechupe o frosting?: ");
			    int velasRechupe = scanner.nextInt();
			    
			    int envasesDefectuosos = velasQuebradas + velasSucias + velasPabilo + velasRechupe;
			    int envasesUtiles = cantidadVelasBuenas - envasesDefectuosos;
			    
			    if (envasesUtiles < 0) {
			        System.out.println("Error: El número de envases defectuosos excede el total de envases.");
			        return;  
			    } else {
			        System.out.println("Envases útiles: " + envasesUtiles);
			        return;
			    }
			} catch (InterruptedException e) {
			    System.out.println("Error en la producción: " + e.getMessage());
			}
		
		int envasesDefectuosos = 0;
		if (envasesDefectuosos > 0) {
			System.out.println("Velas devueltas a la sección de robótica, para reutilizar y recuperar el material");
	        return;  
	    } else {
	        System.out.println("Pedido revisado con éxito"); 
	        return;
		}
    }

}
