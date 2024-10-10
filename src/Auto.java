public class Auto {
    String marca;
    String modelo;
    double velocidadMax;
    double tiempoAceleracion;

    public Auto(String marca, String modelo, double velocidadMax, double tiempoAceleracion) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMax = velocidadMax;
        this.tiempoAceleracion = tiempoAceleracion;
    }


    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public double getVelocidadMax() {
        return velocidadMax;
    }
    public double getTiempoAceleracion() {
        return tiempoAceleracion;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setVelocidadMax(double velocidadMax) {
        this.velocidadMax = velocidadMax;
    }
    public void setTiempoAceleracion(double tiempoAceleracion) {
        this.tiempoAceleracion = tiempoAceleracion;
    }
}
