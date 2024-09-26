
public class Destinatario {
	private String nombre;
    private String id;
    private String telefono;
    private String direccion;

    public Destinatario(String nombre, String id, String telefono, String direccion) {
        this.nombre = nombre;
        this.id = id;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Destinatario:\n" +
               "Nombre: " + nombre + "\n" +
               "ID: " + id + "\n" +
               "Teléfono: " + telefono + "\n" +
               "Dirección: " + direccion;
    }
}

