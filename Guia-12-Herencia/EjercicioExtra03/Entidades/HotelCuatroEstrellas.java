package Entidades;

public class HotelCuatroEstrellas extends Hotel {
    protected boolean gimnasio;
    protected String tipoGym;
    protected String nombreRestaurante;
    protected int capacidadRestaurante;

    public HotelCuatroEstrellas() {
    }

    public HotelCuatroEstrellas(boolean gimnasio, String tipoGym, String nombreRestaurante, int capacidadRestaurante, int cantidadHabitaciones, int numeroCamas, int cantidadPisos, double precio, String nombre, String direccion, String localidad, String gerente) {
        super(cantidadHabitaciones, numeroCamas, cantidadPisos, precio, nombre, direccion, localidad, gerente);
        this.gimnasio = gimnasio;
        this.tipoGym = tipoGym;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public boolean isGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(boolean gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public int getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(int capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public String getTipoGym() {
        return tipoGym;
    }

    public void setTipoGym(String tipoGym) {
        this.tipoGym = tipoGym;
    }

    @Override
    public double precioHabitacion() {       
        int valorAgregadoRestaurante = 0, valorAgregadoGimnasio = 0;
        
        if(capacidadRestaurante < 30) {
            valorAgregadoRestaurante = 10;
        } else if (capacidadRestaurante >= 30 && capacidadRestaurante <= 50) {
            valorAgregadoRestaurante = 30;
        } else if (capacidadRestaurante > 50) {
            valorAgregadoRestaurante = 50;
        }
        
        if (gimnasio) {
            if(tipoGym.equalsIgnoreCase("A")) {
                valorAgregadoGimnasio = 50;
            } else {
                valorAgregadoGimnasio = 30;
            }
        }
        return super.precioHabitacion() + valorAgregadoRestaurante + valorAgregadoGimnasio;
    }   

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "--- Hotel cuatro estrellas ---" + "\n" +
               "Gimnasio: " + gimnasio + "\n" +
               "Tipo de gimnasio: " + tipoGym + "\n" +
               "Nombre de restaurante: " + nombreRestaurante + "\n" +
               "Capacidad del restaurante: " + capacidadRestaurante;
    }
}
