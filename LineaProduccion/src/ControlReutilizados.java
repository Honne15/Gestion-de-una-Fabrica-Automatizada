import java.util.Scanner;

public class ControlReutilizados extends LineaProduccion{
	public static final int CONTROLREUTILIZADOS = 100;
	
	private Reutilizacion reutilizacion;

    public ControlReutilizados(Reutilizacion reutilizacion) {
        super("Control Reutilizados");  
        this.reutilizacion = reutilizacion; 
    }
    
    @Override
    public void producir(Scanner scanner) {
        int cantidadVelasBuenas = reutilizacion.getCantidadReutilizados(); 

        try {
            System.out.println("\nIniciando Control de Calidad...");
            Thread.sleep(2000);
       
            System.out.println("\n¿Cuántas velas se encuentran quebradas?: ");
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
                System.out.println("\nVelas que pasaron el control de calidad: " + envasesUtiles);
            }

            if (envasesDefectuosos > 0) {
                System.out.println("\nVelas defectuosas devueltas a la sección de robótica para reutilizar y recuperar el material.");
            } else {
                System.out.println("\nPedido de reutilización revisado con éxito."); 
            }

        } catch (InterruptedException e) {
            System.out.println("Error en la producción: " + e.getMessage());
        }
    }
}
