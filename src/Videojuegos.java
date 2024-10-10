public class Videojuegos {
    String nombre;
    String genero;
    String plataforma;
    int anio_de_lanzamiento;

    public Videojuegos(String nombre, String genero, String plataforma, int anio_de_lanzamiento) {
        this.nombre = nombre;
        this.genero = genero;
        this.plataforma = plataforma;
        this.anio_de_lanzamiento = anio_de_lanzamiento;
    }

//    public void imprimir(){
//        System.out.println("El nombre es : " + nombre);
//        System.out.println("El genero es : " + genero);
//        System.out.println("La plataforma es : " + plataforma);
//        System.out.println("El Anio de lanzamiento es : " + anio_de_lanzamiento);
//        System.out.println("---------------");
//    }
//
//    public int Anio_de_lanzamiento(){
//        return this.anio_de_lanzamiento+5;
//    }
    //Constructor vacio



    //getters
    public String getNombre() {
        return nombre;
    }
    public String getGenero() {
        return genero;
    }
    public String getPlataforma() {
        return plataforma;
    }
    public int getAnio_de_lanzamiento() {
        return anio_de_lanzamiento;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
    public void setAnio_de_lanzamiento(int anio_de_lanzamiento) {
        this.anio_de_lanzamiento = anio_de_lanzamiento;
    }
}
