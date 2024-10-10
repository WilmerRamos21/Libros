public class Cancion {
    String nombre;
    String genero;
    String artista;
    int duracion;

    public Cancion (String nombre, String genero, String artista, int duracion) {
        this.nombre = nombre;
        this.genero = genero;
        this.artista = artista;
        this.duracion = duracion;
    }
    public void imprimir(){
        System.out.println("El nombre es : " + this.nombre);
        System.out.println("El genero es : " + this.genero);
        System.out.println("El artista es : " + this.artista);
        System.out.println("La duracion de la cancion es : " + this.duracion);
        System.out.println("----------------");
    }
    public int imprimirDuracion(){
        return this.duracion+5;
    }
}


