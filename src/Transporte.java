public class Transporte {
    String nombre;
    String tipo_circulacion;
    double precio_pasaje;
    int anios_operativo;


    public Transporte(String nombre, String tipo_circulacion, double precio_pasaje, int anios_operativo) {
        this.nombre = nombre;
        this.tipo_circulacion = tipo_circulacion;
        this.precio_pasaje = precio_pasaje;
        this.anios_operativo = anios_operativo;
    }

    public void Impresion_transporte(){
        System.out.println("Nombre del vehiculo: "+nombre);
        System.out.println("Tipo de circulacion del transporte: "+tipo_circulacion);
        System.out.println("Precio del pasaje en el Transporte: $"+precio_pasaje);
        System.out.println("Anios de operacion del transporte: "+anios_operativo);
        System.out.println("-----------------");
    }
}
