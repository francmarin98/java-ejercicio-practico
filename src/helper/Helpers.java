package helper;

public class Helpers {

    public static boolean cadenaSoloLetras(String cadena){
        for (int i = 0; i < cadena.length(); i++)
        {
            char caracter = cadena.toUpperCase().charAt(i);
            if ((int)caracter != 165 && ((int)caracter < 65 || (int)caracter > 90))
                return false; //Se ha encontrado un caracter que no es letra
        }

        return true;
    }
}
