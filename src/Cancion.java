public class Cancion {
    String nombre;
    String artista;
    double duracion;
    double visualizaciones;
    String genero;


    public Cancion(String nombre, String artista, double duracion, double visualizaciones, String genero) {
        this.nombre = nombre;
        this.artista = artista;
        this.duracion = duracion;
        this.visualizaciones = visualizaciones;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getArtista() {
        return artista;
    }
    public void setArtista(String artista) {
        this.artista = artista;
    }
    public double getDuracion() {
        return duracion;
    }
    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
    public double getVisualizaciones() {
        return visualizaciones;
    }
    public void setVisualizaciones(double visualizaciones) {
        this.visualizaciones = visualizaciones;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }
    public String getArtista() {
        return artista;
    }
    public int getDuracion() {
        return duracion;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setArtista(String artista) {
        this.artista = artista;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }



}
