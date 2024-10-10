public class Series {
    String nombre;
    String genero;
    int capitulos;
    int anio_publicacion;

    public Series(String name, String genero, int capitulos, int anio_publicacion) {
        this.nombre = name;
        this.genero = genero;
        this.capitulos = capitulos;
        this.anio_publicacion = anio_publicacion;
    }

//    public void imprimir(){
//        System.out.println("Nombre: " + nombre);
//        System.out.println("Genero: " + genero);
//        System.out.println("Capitulos: " + capitulos);
//        System.out.println("Anio de publicacion: " + anio_publicacion);
//        System.out.println("--------------");
//    }
//    public int Capitulos(){
//        return this.capitulos+5;
//    }
//    public int Anio_publicacion(){
//        return this.anio_publicacion+5;
//    }

    //Constructor vacio
    public Series (){

    }

    //getters
    public String getNombre() {
        return nombre;
    }
    public String getGenero() {
        return genero;
    }
    public int getCapitulos() {
        return capitulos;
    }
    public int getAnioPublicacion() {
        return anio_publicacion;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setCapitulos(int capitulos) {
        this.capitulos = capitulos;
    }
    public void setAnioPublicacion(int anio_publicacion) {
        this.anio_publicacion = anio_publicacion;
    }

}
