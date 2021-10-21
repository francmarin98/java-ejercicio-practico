package persona;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GestionaPersonas {

    HashMap<String, ArrayList<String>> trabajadores = new HashMap<>();
    ArrayList<String> grupoTrabajo = new ArrayList<String>();

    public GestionaPersonas() {}

    public void agregarTrabajador(){

    }

    public void eliminarTrabajador(){

    }

    public void agregarTrabajadorAlGrupoDeTrabajo(){

    }

    public void eliminarTrabajadorAlGrupoDeTrabajo(){

    }

    public void menuOpciones() {
        Scanner in = new Scanner(System.in);
        boolean salir = true;
        int opcion;
        while (salir) {
            System.out.println("------------------ ¿Qué desea hacer? --------------------");
            System.out.println("[1] Crear un trabajador");
            System.out.println("[2] Borrar un trabajador");
            System.out.println("[3] Añadir un trabajador al grupo de trabajo");
            System.out.println("[4] Borrar un trabajador del grupo de trabajo");
            System.out.println("[0] Salir");
            System.out.print("Ingrese una opción: ");
            opcion = in.nextInt();

            switch (opcion) {
                case 1 -> System.out.println("Has seleccionado la opcion 1");
                case 2 -> System.out.println("Has seleccionado la opcion 2");
                case 3 -> System.out.println("Has seleccionado la opcion 3");
                case 4 -> System.out.println("Has seleccionado la opcion 4");
                case 0 -> {
                    System.out.println("Has seleccionado la opcion salir");
                    salir = false;
                }
                default -> System.out.println("Solo números entre 0 y 4");
            }
        }
    }
}