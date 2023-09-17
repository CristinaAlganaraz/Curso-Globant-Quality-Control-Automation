package ejextraherencia02;

import Entidades.Edificio;
import Entidades.EdificioDeOficinas;
import Entidades.Polideportivo;
import java.util.ArrayList;

public class EjExtraHerencia02 {

    public static void main(String[] args) {

        Polideportivo poli1 = new Polideportivo("Andorra", "Techado", 18, 6, 30);
        Polideportivo poli2 = new Polideportivo("Cochocho Vargas", "Abierto", 12, 0, 21);

        EdificioDeOficinas edif1 = new EdificioDeOficinas(6, 15, 30, 15, 70, 19);
        EdificioDeOficinas edif2 = new EdificioDeOficinas(10, 12, 12, 8, 20, 34);

        ArrayList<Edificio> edificios = new ArrayList<>();
        edificios.add(poli1);
        edificios.add(poli2);
        edificios.add(edif1);
        edificios.add(edif2);

        System.out.println("SUPERFICIE Y VOLUMEN DE CADA EDIFICIO:");
        System.out.println("");
        for (Edificio edificio : edificios) {
            System.out.println(edificio.toString());
            System.out.println("");
            System.out.println("Superficie: " + edificio.calcularSuperficie() + " m2.");
            if (edificio instanceof Polideportivo && edificio.calcularVolumen() == 0) {
                System.out.println("Polideportivo abierto. No se puede medir el volumen.");
                System.out.println("");
            } else {
                System.out.println("Volumen: " + edificio.calcularVolumen() + " m3.");
                System.out.println("");
            }
        }
        System.out.println("");
        System.out.println("------------------------------------------------");
        System.out.println("CANTIDAD DE POLIDEPORTIVOS TECHADOS Y ABIERTOS:");
        System.out.println("");
        int techado = 0, abierto = 0;
        for (Edificio polideportivo : edificios) {
            if (polideportivo instanceof Polideportivo) {
                if (((Polideportivo) polideportivo).getTipoInstalacion().equalsIgnoreCase("Techado")) {
                    techado++;
                } else if (((Polideportivo) polideportivo).getTipoInstalacion().equalsIgnoreCase("Abierto")) {
                    abierto++;
                }
            }
        }
        System.out.println("Cantidad de polideportivos techados: " + techado);
        System.out.println("Cantidad de polideportivos abiertos: " + abierto);

        System.out.println("------------------------------------------------");
        System.out.println("CANTIDAD DE PERSONAS POR EDIFICIO:");
        System.out.println("");
        for (Edificio edificioDeOficinas : edificios) {
            if (edificioDeOficinas instanceof EdificioDeOficinas) {
                System.out.println(((EdificioDeOficinas) edificioDeOficinas).toString());
                System.out.println("");
                ((EdificioDeOficinas) edificioDeOficinas).cantidadPersonas();
                System.out.println("");
            }
        }
    }
}
