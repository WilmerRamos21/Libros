public class Videojuegos {
    String nombre;
    String genero;
    String plataforma;
    int anio_lanzamiento;

    public Videojuegos(String nombre, String genero, String plataforma, int anio_lanzamiento) {
        this.nombre = nombre;
        this.genero = genero;
        this.plataforma = plataforma;
        this.anio_lanzamiento = anio_lanzamiento;
    }

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
    public int getAnio_lanzamiento() {
        return anio_lanzamiento;
    }


    //setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
    public void setAnio_lanzamiento(int anio_lanzamiento) {
        this.anio_lanzamiento = anio_lanzamiento;
    }
}
