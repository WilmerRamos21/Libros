public class Libro {
    //Atributos
    String titulo;
    String autor;
    String editorial;
    int paginas;


    //Metodos
        //Constructor
    public Libro(String titulo, String autor, String editorial, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.paginas = paginas;

    }
    //Metodos Personalizados
    public void imprimir(){
        System.out.println("El titulo es: "+this.titulo);
        System.out.println("El autor es: "+this.autor);
        System.out.println("la editorial es: "+this.editorial);
        System.out.println("El numero de paginas es: "+this.paginas);
        System.out.println("---------------");
    }

    public int imprimirCubierta(){
        return this.paginas+5;
    }
}
