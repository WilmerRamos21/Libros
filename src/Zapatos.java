public class Zapatos {
    String marca;
    String tipo;
    String color;
    float talla;
    double precio;

    public Zapatos(String marca, String tipo, String color, float talla , double precio) {
        this.marca = marca;
        this.tipo = tipo;
        this.color = color;
        this.talla = talla;
        this.precio = precio;
    }

    public void Imprimir(){
        System.out.println("Marca de zapatos: " + this.marca);
        System.out.println("Tipo de zapatos: " + this.tipo);
        System.out.println("Color de zapatos: " + this.color);
        System.out.println("Talla de zapatos: " + this.talla);
        System.out.println("Precio del par de zapatos $: " + this.precio);
        System.out.println("--------------");
    }

}
