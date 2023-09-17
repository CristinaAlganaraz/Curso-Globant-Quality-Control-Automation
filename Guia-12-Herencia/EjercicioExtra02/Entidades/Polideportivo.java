package Entidades;

public class Polideportivo extends Edificio{
    private String nombre;
    private String tipoInstalacion;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, String tipoInstalacion, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoInstalacion() {
        return tipoInstalacion;
    }

    public void setTipoInstalacion(String tipoInstalacion) {
        this.tipoInstalacion = tipoInstalacion;
    }

    @Override
    public double calcularSuperficie() {
        return ancho * largo;
    }

    @Override
    public double calcularVolumen() {
        if (tipoInstalacion.equalsIgnoreCase("TECHADO")) {
            return largo * ancho * alto;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Polideportivo{" + "Nombre: " + nombre + ", Tipo de instalación: " + tipoInstalacion + ", Ancho: " + ancho + " mts." + ", Alto: " + alto + " mts." + ", Largo: " + largo + " mts." + '}';
    }
}
