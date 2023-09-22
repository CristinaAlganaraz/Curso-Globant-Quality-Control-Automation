package Servicios;

import Entidades.Madre;
import Excepciones.MadreException;

public class MadreService {

    public void buscarHijo(Madre madre, int i) throws MadreException {
        try {
            if (i > madre.getHijos().length) {
                throw new MadreException("Está intentando buscar un índice que supera el tamaño del vector.");
            }
            if (i < 0) {
                throw new MadreException("El índice debe ser mayor a 0.");
            }
            for (int j = 0; j < madre.getHijos().length; j++) {
                if (j == i) {
                    System.out.println(madre.getHijos()[i]);
                    break;
                }
            }
        } catch (MadreException e) {
            throw e;
        } catch (Exception e) {
            e.printStackTrace();
            throw new MadreException("Ha surgido un error.");
        }
    }
}
