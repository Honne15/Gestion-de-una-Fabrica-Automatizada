import java.util.Scanner;

public class LineaProduccion {
	
    protected String nombreLinea;

    public LineaProduccion(String nombreLinea) {
        this.nombreLinea = nombreLinea;
    }

   
    public void iniciarProduccion() {
        System.out.println("\nIniciando producción en la línea: " + nombreLinea);
    }

   
    public void producir(Scanner scanner) {
    }
   
}
