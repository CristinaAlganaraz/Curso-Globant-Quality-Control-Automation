package Entidades;

public abstract class ExtraHotelero extends Alojamiento {
    protected boolean privado;
    protected double cantidadMetrosCuadrados;

    public ExtraHotelero() {
    }

    public ExtraHotelero(boolean privado, double cantidadMetrosCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.cantidadMetrosCuadrados = cantidadMetrosCuadrados;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public double getCantidadMetrosCuadrados() {
        return cantidadMetrosCuadrados;
    }

    public void setCantidadMetrosCuadrados(double cantidadMetrosCuadrados) {
        this.cantidadMetrosCuadrados = cantidadMetrosCuadrados;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "--- Extra Hotelero --- " + "\n" +
               "Privado: " + privado + "\n" +
               "Cantidad de m2: " + cantidadMetrosCuadrados;
    }    
}
