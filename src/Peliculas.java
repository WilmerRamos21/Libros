public class Peliculas {
    String titulo;
    String autor;
    String genero;
    double duracion;
    int anio_publicacion;


    Peliculas(String titulo, String autor, String genero, double duracion, int anio_publicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.duracion = duracion;
        this.anio_publicacion = anio_publicacion;
    }

    public void Impresion_peliculas(){
        System.out.println("Titulo de la pelicula: " + this.titulo);
        System.out.println("Autor de la pelicula: " + this.autor);
        System.out.println("Genero de la pelicula: " + this.genero);
        System.out.println("Duracion (Hora/minutos): " + this.duracion);
        System.out.println("Anio de publicacion: " + this.anio_publicacion);
        System.out.println("------------------");
    }
}
