package Entidades;

public class Camping extends ExtraHotelero {
    private int capacidadMaxCarpas;
    private int cantidadBanios;
    private boolean restaurante;

    public Camping() {
    }

    public Camping(int capacidadMaxCarpas, int cantidadBanios, boolean restaurante, boolean privado, double cantidadMetrosCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(privado, cantidadMetrosCuadrados, nombre, direccion, localidad, gerente);
        this.capacidadMaxCarpas = capacidadMaxCarpas;
        this.cantidadBanios = cantidadBanios;
        this.restaurante = restaurante;
    }

    public int getCapacidadMaxCarpas() {
        return capacidadMaxCarpas;
    }

    public void setCapacidadMaxCarpas(int capacidadMaxCarpas) {
        this.capacidadMaxCarpas = capacidadMaxCarpas;
    }

    public int getCantidadBanios() {
        return cantidadBanios;
    }

    public void setCantidadBanios(int cantidadBanios) {
        this.cantidadBanios = cantidadBanios;
    }

    public boolean isRestaurante() {
        return restaurante;
    }

    public void setRestaurante(boolean restaurante) {
        this.restaurante = restaurante;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "--- Camping ---" + "\n" +
               "Capacidad máxima de carpas: " + capacidadMaxCarpas + "\n" +
               "Cantidad de baños: " + cantidadBanios + "\n" +
               "Restaurante: " + restaurante;
    }
}
