package Interfaces;

public interface ValidadorFechas {

    static int MAX_VALID_YR = 9999;
    static int MIN_VALID_YR = 1800;

    static boolean esBisiesto(int anio) {
        return (((anio % 4 == 0) && (anio % 100 != 0)) || (anio % 400 == 0));
    }

    public static boolean esFechaValida(int dia, int mes, int anio) {
        if (anio > MAX_VALID_YR || anio < MIN_VALID_YR) {
            return false;
        }
        if (mes < 1 || mes > 12) {
            return false;
        }
        if (dia < 1 || dia > 31) {
            return false;
        }

        if (mes == 2) {
            if (esBisiesto(anio)) {
                return (dia <= 29);
            } else {
                return (dia <= 28);
            }
        }

        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            return (dia <= 30);
        }
        return true;
    }
}
