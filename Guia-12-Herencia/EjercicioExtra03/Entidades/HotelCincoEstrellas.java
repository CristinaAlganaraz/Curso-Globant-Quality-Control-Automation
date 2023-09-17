package Entidades;

public class HotelCincoEstrellas extends HotelCuatroEstrellas {
    private int cantidadSalonesConferencia;
    private int cantidadSuites;
    private int cantidadLimosinas;

    public HotelCincoEstrellas() {
    }

    public HotelCincoEstrellas(int cantidadSalonesConferencia, int cantidadSuites, int cantidadLimosinas, boolean gimnasio, String tipoGym, String nombreRestaurante, int capacidadRestaurante, int cantidadHabitaciones, int numeroCamas, int cantidadPisos, double precio, String nombre, String direccion, String localidad, String gerente) {
        super(gimnasio, tipoGym, nombreRestaurante, capacidadRestaurante, cantidadHabitaciones, numeroCamas, cantidadPisos, precio, nombre, direccion, localidad, gerente);
        this.cantidadSalonesConferencia = cantidadSalonesConferencia;
        this.cantidadSuites = cantidadSuites;
        this.cantidadLimosinas = cantidadLimosinas;
    }

    public int getCantidadSalonesConferencia() {
        return cantidadSalonesConferencia;
    }

    public void setCantidadSalonesConferencia(int cantidadSalonesConferencia) {
        this.cantidadSalonesConferencia = cantidadSalonesConferencia;
    }

    public int getCantidadSuites() {
        return cantidadSuites;
    }

    public void setCantidadSuites(int cantidadSuites) {
        this.cantidadSuites = cantidadSuites;
    }

    public int getCantidadLimosinas() {
        return cantidadLimosinas;
    }

    public void setCantidadLimosinas(int cantidadLimosinas) {
        this.cantidadLimosinas = cantidadLimosinas;
    }

    @Override
    public double precioHabitacion() {        
        return super.precioHabitacion() + (15 * cantidadLimosinas); 
    }   

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "--- Hotel cinco estrellas ---" + "\n" +
                "Cantidad de salones de conferencia: " + cantidadSalonesConferencia + "\n" +
                "Cntidad de suites: " + cantidadSuites + "\n" +
                "Cantidad de limosinas: " + cantidadLimosinas;
    }   
}
