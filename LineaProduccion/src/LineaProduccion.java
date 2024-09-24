
public class LineaProduccion {
	public static final int ROBOTICA = 180;
    public static final int DECORACION = 60;
    public static final int CONTROL_CALIDAD = 120;
    public static final int EMBALAJE = 120;
    
    protected String nombreLinea;

    public LineaProduccion(String nombreLinea) {
        this.nombreLinea = nombreLinea;
    }

   
    public void iniciarProduccion() {
        System.out.println("Iniciando producción en la línea: " + nombreLinea);
    }

   
    public void producir() {
    }
}
