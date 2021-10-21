package persona;

import excepciones.DniIncorrecto;
import excepciones.EdadIncorrecta;
import excepciones.NombreIncorrecto;
import helper.Helpers;

public class Persona {
    private String name;
    private byte edad;
    private String dni;

    public Persona(String name, byte edad, String dni) {
        this.name = name;
        this.edad = edad;
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        try {
            if (name.length() < 3) {
                throw new NombreIncorrecto("El nombre debe tener mínimo 3 letras");
            }

            if (Helpers.cadenaSoloLetras(name)) {
                throw new NombreIncorrecto("El nombre no puede contener números");
            }

            this.name = name;
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        try {
            if (edad < 1 || edad > 110) {
                throw new EdadIncorrecta("La edad no puede ser menor a 1 ni mayor a 110");
            }

            this.edad = edad;
        } catch (NumberFormatException e) {
            throw new NumberFormatException("La edad debe ser un número");
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        try {
            if (dni.length() < 9) {
                throw new DniIncorrecto("El DNI ha de ser una string de 9 valores");
            }
            this.dni = dni;
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
    }
}
