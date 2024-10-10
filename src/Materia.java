public class Materia {
    String materia;
    String carrera;
    String docente;
    int horas_semana;


    public Materia(String nombre_materia, String carrera, String nombre_docente, int horas_semana) {
        this.materia = nombre_materia;
        this.carrera = carrera;
        this.horas_semana = horas_semana;
        this.docente = nombre_docente;
    }

    public void Impresion_materias(){
        System.out.println("Nombre de la materia: "+this.materia);
        System.out.println("Carrera: "+this.carrera);
        System.out.println("Nombre del docente: Ing."+this.docente);
        System.out.println("Horas a la semana: "+this.horas_semana);
        System.out.println("---------------");
    }
}
