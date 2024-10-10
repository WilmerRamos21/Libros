import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hola a todos");
        //Para declarar el objeto
        //Para instanciar una clase
    Libro libro1 = new Libro("La odisea", "Homero","Antares", 300);
    Libro libro2 = new Libro("La iliada", "Homero","Antares", 350);
    Libro libro3 = new Libro("Narraciones Extraordinarias", "Edgar Allan Poe","Antares", 400);
    Libro libro4 = new Libro("Baldomera","Alberto Sanches", "Antarares",200);
    Libro libro5 = new Libro("Viaje al centro de la tierra","Julio Verme","Antarares",500);

    libro1.imprimir();
    libro1.imprimirCubierta();
    libro2.imprimir();
    libro2.imprimirCubierta();
    libro3.imprimir();
    libro3.imprimirCubierta();
    libro4.imprimir();
    libro4.imprimirCubierta();
    libro5.imprimir();
    libro5.imprimirCubierta();

    


    }
}