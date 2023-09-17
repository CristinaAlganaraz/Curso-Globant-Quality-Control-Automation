package Entidades;

public class Residencia extends ExtraHotelero {
    private int cantidadHabitaciones;
    private boolean descuentoGremios;
    private boolean campoDeportivo;

    public Residencia() {
    }

    public Residencia(int cantidadHabitaciones, boolean descuentoGremios, boolean campoDeportivo, boolean privado, double cantidadMetrosCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(privado, cantidadMetrosCuadrados, nombre, direccion, localidad, gerente);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.descuentoGremios = descuentoGremios;
        this.campoDeportivo = campoDeportivo;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public boolean isDescuentoGremios() {
        return descuentoGremios;
    }

    public void setDescuentoGremios(boolean descuentoGremios) {
        this.descuentoGremios = descuentoGremios;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "--- Residencia ---" + "\n" +
               "Cantidad de habitaciones: " + cantidadHabitaciones + "\n" +
               "Descuento a gremios: " + descuentoGremios + "\n" +
               "Campo deportivo: " + campoDeportivo;
    }
}
