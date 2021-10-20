public class Persona {
    private String name;
    private byte edad;
    private int  dni;

    public Persona(String name, byte edad, int dni) {
        this.name = name;
        this.edad = edad;
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
}
