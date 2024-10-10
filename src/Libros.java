public class Libros {
    String titulo;
    String autor;
    int anio_lanzamiento;
    int paginas;

    public Libros(String titulo, String autor, int anio_lanzamiento, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.anio_lanzamiento = anio_lanzamiento;
    }

    public void imprimir(){
        System.out.println("El titulo es: "+this.titulo);
        System.out.println("El autor es: "+this.autor);
        System.out.println("El anio de publicacion es: "+this.anio_lanzamiento);
        System.out.println("El numero de paginas es: "+this.paginas);
        System.out.println("------------------");
    }

    public int imprimirCubierta(){
        return this.paginas+5;
    }
}


