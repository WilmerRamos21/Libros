public class Persona {
    String nombre;
    int edad;
    String sexo;
    double altura;
    int CI;
    String fecha_nacimiento;


    public Persona(String nombre, int edad, String sexo, double altura, int CI, String fecha_nacimiento){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.altura = altura;
        this.CI = CI;
        this.fecha_nacimiento = fecha_nacimiento;
    }


    public void impresion_datos_persona(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Altura (metros): " + this.altura);
        System.out.println("CI: " + this.CI);
        System.out.println("Fecha nacimiento: " + this.fecha_nacimiento);
        System.out.println("----------------");
    }
}
