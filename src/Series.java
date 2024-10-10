public class Series {
    String nombre;
    String publico_dirigido;
    int capitulos;
    int anio_lanzamiento;


    public Series(String nombre, String publico_dirigido, int capitulos, int anio_lanzamiento) {
        this.nombre = nombre;
        this.publico_dirigido = publico_dirigido;
        this.capitulos = capitulos;
        this.anio_lanzamiento = anio_lanzamiento;
    }

    public void Impresion_serie(){
        System.out.println("Nombre de la serie: " + nombre);
        System.out.println("Publico dirigido de la serie: " + publico_dirigido);
        System.out.println("Capitulos de la serie: " + capitulos);
        System.out.println("Anio de emision de la serie: " + anio_lanzamiento);
        System.out.println("----------------");
    }
}
