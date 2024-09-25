import java.util.Scanner;

public class Embalaje extends LineaProduccion {

    public Embalaje() {
        super("Embalaje");
    }

    @Override
    public void producir(Scanner scanner) {
            
          try {
            System.out.println("\nPreparando caja con separadores para empaque...");
            Thread.sleep(2000);

            System.out.println("Empacando velas en papel burbuja...");
            Thread.sleep(2000);

            System.out.println("Empacando velas en la caja...");
            Thread.sleep(2000);

            System.out.println("Cellando caja...");
            Thread.sleep(2000);

            System.out.println("\nVelas empacadas con éxito...");
            Thread.sleep(2000);

            System.out.println("\nIngresa la información para el rótulo de la caja");
            Thread.sleep(2000);

            String rotulo = crearRotulo(scanner);
            System.out.println(rotulo);

            System.out.println("\nTu embalaje está listo para envío.");
            Thread.sleep(2000);
            
            return;

        } catch (InterruptedException e) {
            System.out.println("Error en la producción: " + e.getMessage());
        }
    }

    private String crearRotulo(Scanner scanner) {
        System.out.println("\n--- Información del Remitente ---");
        System.out.print("Nombre del remitente: ");
        String nombreRemitente = scanner.nextLine();
        System.out.print("ID del remitente: ");
        String idRemitente = scanner.nextLine();
        System.out.print("Teléfono del remitente: ");
        String telefonoRemitente = scanner.nextLine();
        System.out.print("Dirección del remitente: ");
        String direccionRemitente = scanner.nextLine();

        Remitente remitente = new Remitente(nombreRemitente, idRemitente, telefonoRemitente, direccionRemitente);

        System.out.println("\n--- Información del Destinatario ---");
        System.out.print("Nombre del destinatario: ");
        String nombreDestinatario = scanner.nextLine();
        System.out.print("ID del destinatario: ");
        String idDestinatario = scanner.nextLine();
        System.out.print("Teléfono del destinatario: ");
        String telefonoDestinatario = scanner.nextLine();
        System.out.print("Dirección del destinatario: ");
        String direccionDestinatario = scanner.nextLine();

        Destinatario destinatario = new Destinatario(nombreDestinatario, idDestinatario, telefonoDestinatario, direccionDestinatario);

        String rotulo = "\nPegando Rótulo en la caja...\n" +
                        "\nEste es el Rótulo:\n" +
                        remitente.toString() + "\n\n" +
                        destinatario.toString();
        return rotulo;
    }

    class Destinatario {
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

    class Remitente {
        private String nombre;
        private String id;
        private String telefono;
        private String direccion;

        public Remitente(String nombre, String id, String telefono, String direccion) {
            this.nombre = nombre;
            this.id = id;
            this.telefono = telefono;
            this.direccion = direccion;
        }

        @Override
        public String toString() {
            return "Remitente:\n" +
                   "Nombre: " + nombre + "\n" +
                   "ID: " + id + "\n" +
                   "Teléfono: " + telefono + "\n" +
                   "Dirección: " + direccion;
        }
    }
}
