public class Instrumento_musical {
    String propietario;
    String nombre;
    String tipo;
    double precio;
    int anio_adquisicion;


    public Instrumento_musical(String propietario, String nombre, String tipo, double precio, int anio_adquisicion) {
        this.propietario = propietario;
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
        this.anio_adquisicion = anio_adquisicion;
    }

    public void Impresion_instrumento(){
        System.out.println("Nombre del propietario: "+this.propietario);
        System.out.println("Nombre del instrumento: "+this.nombre);
        System.out.println("Tipo de instrumento: "+this.tipo);
        System.out.println("Precio del instrumento: $"+this.precio);
        System.out.println("Anio de adquisicion del instrumento: "+this.anio_adquisicion);
        System.out.println("-------------------");
    }
}
