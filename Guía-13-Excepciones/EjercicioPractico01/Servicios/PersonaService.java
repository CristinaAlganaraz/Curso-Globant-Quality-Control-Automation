package Servicios;

import Entidades.Persona;
import Excepciones.PersonaException;

public class PersonaService {

    public void esMayorDeEdad(Persona persona) throws PersonaException {
        try {
            if (persona == null) {
                throw new PersonaException("El objeto está vacío.");
            }
            if (persona.getEdad() < 0) {
                System.out.println("La edad debe ser mayor a 0.");
            } else if (persona.getEdad() >= 0 && persona.getEdad() < 18) {
                System.out.println("Es menor de edad.");
            } else if (persona.getEdad() >= 18) {
                System.out.println("Es mayor de edad.");
            }
        } catch (PersonaException e) {
            throw e;
        } catch (Exception e) {
            throw new PersonaException("Ha surgido un error.");
        }
    }
}
