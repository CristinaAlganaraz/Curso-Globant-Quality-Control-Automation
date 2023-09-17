package ejextraherencia03;

import Entidades.Alojamiento;
import Entidades.Camping;
import Entidades.ExtraHotelero;;
import Entidades.Hotel;
import Entidades.HotelCincoEstrellas;
import Entidades.HotelCuatroEstrellas;
import Entidades.Residencia;
import Servicios.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class EjExtraHerencia03 {

    public static void main(String[] args) {
        ArrayList<Alojamiento> alojamientos = instanciarAlojamientos();
        Service servicio = new Service();
        Scanner leer = new Scanner(System.in);
        int opcion;

        do {
            System.out.println(":::::::::: MENÚ DE OPCIONES ::::::::::");
            System.out.println("");
            System.out.println("1- Mostrar todos los alojamientos");
            System.out.println("2- Mostrar todos los hoteles de más caro a más barato");
            System.out.println("3- Mostrar todos los campings con restaurante");
            System.out.println("4- Mostrar todos las las residencias que tienen descuento");
            System.out.println("5- Salir del sistema");
            System.out.println("");
            System.out.println("Elija una opción:");
            opcion = leer.nextInt();
            
            switch(opcion) {
                case 1:
                    servicio.mostrarAlojamientos(alojamientos);
                    break;
                case 2:
                    servicio.mostrarHotelPrecioDescendente(alojamientos);
                    break;
                case 3:
                    servicio.mostrarCampingsConRestaurante(alojamientos);
                    break;
                case 4:
                    servicio.mostrarResidenciasConDescuento(alojamientos);
                    break;
                case 5:
                    System.out.println("Ha salido del sistema.");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        }while(opcion != 5);
    
    }
    
    public static ArrayList<Alojamiento> instanciarAlojamientos() {
        ArrayList<Alojamiento> alojamientos = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            List<String> nombresAlojamientos = Arrays.asList("Beagle", "Albatros", "Arakur", "Glaciar", "El faro", "Los Cauquenes");
            List<String> direccionesAlojamientos = Arrays.asList("Maipu 566", "San Martin 145", "Gobernador Paz 1234", "Alem 2334", "Austral 445");
            List<String> localidadAlojamientos = Arrays.asList("El Calafate", "Ushuaia", "El Chaltén", "Puerto Iguazú", "Purmamarca");
            List<String> gerenteAlojamientos = Arrays.asList("Pedro Gomez", "Guillermo Jerez", "Mónica Cáceres", "Mirta Lavate", "Dario Veléz");
            List<Alojamiento> tipoAlojamiento = new ArrayList<>();
            HotelCuatroEstrellas hotelCuatroEstrellas = new HotelCuatroEstrellas();
            HotelCincoEstrellas hotelCincoEstrellas = new HotelCincoEstrellas();
            Camping camping = new Camping();
            Residencia residencia = new Residencia();
            tipoAlojamiento.add(hotelCuatroEstrellas);
            tipoAlojamiento.add(hotelCincoEstrellas);
            tipoAlojamiento.add(camping);
            tipoAlojamiento.add(residencia);
            Alojamiento alojamiento = tipoAlojamiento.get(random.nextInt(tipoAlojamiento.size()));
            alojamiento.setNombre(nombresAlojamientos.get(random.nextInt(nombresAlojamientos.size())));
            alojamiento.setDireccion(direccionesAlojamientos.get(random.nextInt(direccionesAlojamientos.size())));
            alojamiento.setLocalidad(localidadAlojamientos.get(random.nextInt(localidadAlojamientos.size())));
            alojamiento.setGerente(gerenteAlojamientos.get(random.nextInt(gerenteAlojamientos.size())));
            alojamientos.add(alojamiento);
        }

        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Hotel) {
                ((Hotel) alojamiento).setCantidadHabitaciones((int) (Math.random() * (50 - 1)) + 1);
                ((Hotel) alojamiento).setNumeroCamas((int) (Math.random() * (200 - 1)) + 1);
                ((Hotel) alojamiento).setCantidadPisos((int) (Math.random() * (5 - 1)) + 1);
                if (alojamiento instanceof HotelCuatroEstrellas) {
                    ((HotelCuatroEstrellas) alojamiento).setGimnasio(random.nextBoolean());
                    if (((HotelCuatroEstrellas) alojamiento).isGimnasio()) {
                        List<String> tipoGimnasio = Arrays.asList("A", "B");
                        ((HotelCuatroEstrellas) alojamiento).setTipoGym(tipoGimnasio.get(random.nextInt(tipoGimnasio.size())));
                    }
                    List<String> nombresRestaurantes = Arrays.asList("Los lirios", "Kuar", "Lihue", "Kalma", "Andino");
                    ((HotelCuatroEstrellas) alojamiento).setNombreRestaurante(nombresRestaurantes.get(random.nextInt(nombresRestaurantes.size())));
                    ((HotelCuatroEstrellas) alojamiento).setCapacidadRestaurante((int) (Math.random() * (150 - 1)) + 1);
                }
                
                if (alojamiento instanceof HotelCincoEstrellas) {
                    ((HotelCincoEstrellas) ((HotelCuatroEstrellas) alojamiento)).setCantidadLimosinas((int) (Math.random() * (20 - 1)) + 1);
                    ((HotelCincoEstrellas) ((HotelCuatroEstrellas) alojamiento)).setCantidadSalonesConferencia((int) (Math.random() * (10 - 1)) + 1);
                    ((HotelCincoEstrellas) ((HotelCuatroEstrellas) alojamiento)).setCantidadSuites((int) (Math.random() * (20 - 1)) + 1);
                }
                if (alojamiento instanceof HotelCincoEstrellas) {
                    ((HotelCincoEstrellas) ((HotelCuatroEstrellas) alojamiento)).setPrecio(((HotelCincoEstrellas) ((HotelCuatroEstrellas) alojamiento)).precioHabitacion());
                } else {
                    (((HotelCuatroEstrellas) alojamiento)).setPrecio((((HotelCuatroEstrellas) alojamiento)).precioHabitacion());
                }
            } else if (alojamiento instanceof ExtraHotelero) {
                ((ExtraHotelero) alojamiento).setPrivado(random.nextBoolean());
                ((ExtraHotelero) alojamiento).setCantidadMetrosCuadrados((Math.random() * (500 - 1)) + 1);
                if (alojamiento instanceof Camping) {
                    ((Camping) alojamiento).setCantidadBanios((int) (Math.random() * (20 - 1)) + 1);
                    ((Camping) alojamiento).setCapacidadMaxCarpas((int) (Math.random() * (100 - 1)) + 1);
                    ((Camping) alojamiento).setRestaurante(random.nextBoolean());
                }

                if (alojamiento instanceof Residencia) {
                    ((Residencia) alojamiento).setCampoDeportivo(random.nextBoolean());
                    ((Residencia) alojamiento).setDescuentoGremios(random.nextBoolean());
                    ((Residencia) alojamiento).setCantidadHabitaciones((int) (Math.random() * (30 - 1)) + 1);
                }
            }
        }
        return alojamientos;
    }
}
