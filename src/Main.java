import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.Scanner;

public class Main {
    static Vehiculo vehiculo1 = new Vehiculo();
    static Vehiculo vehiculo2 = new Vehiculo();
    static Vehiculo vehiculo3 = new Vehiculo();
    static Vehiculo vehiculo4 = new Vehiculo();
    static Vehiculo vehiculo5 = new Vehiculo();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        System.out.println("Bienvenido al programa");

        do {
            System.out.println("\n\t\t¿Que accion quiere realizar?");
            System.out.println("1. Ingresar Datos de los 5 Vehiculos");
            System.out.println("2. Mostrar los Datos de los 5 Vehiculos ingresados");
            System.out.println("3. Salir del programa");
            System.out.print("Ingresa tu opcion: ");
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    ingresarVehiculos();
                    break;
                case 2:
                    mostrarVehiculos();
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no válida, prueba de nuevo");
                    break;
            }
        } while (opcion != 3);
    }

    public static void ingresarVehiculos(){
        System.out.println("\n\tIngresa los datos de 5 vehiculos");
        int numVehiculo = 1;

        for (int i = 0; i < 5; i++) {
            switch (numVehiculo) {
                case 1:
                    vehiculo1.setearVehiculo(vehiculo1, numVehiculo);
                    break;
                case 2:
                    vehiculo2.setearVehiculo(vehiculo2, numVehiculo);

                    break;
                case 3:
                    vehiculo3.setearVehiculo(vehiculo3, numVehiculo);
                    break;

                case 4:
                    vehiculo4.setearVehiculo(vehiculo4, numVehiculo);

                    break;
                case 5:
                    vehiculo5.setearVehiculo(vehiculo5, numVehiculo);

                    break;
            }
            numVehiculo++;
        }
        System.out.println("\n\t\tDatos ingresados con exito");
    }
    public static void mostrarVehiculos() {
        int numVeh = 1;
        System.out.println("\n\n\t\t\tVEHICULOS INGRESADOS: ");
        for (int i = 0; i < 5; i++) {
            switch (numVeh) {
                case 1:
                    vehiculo1.metodoVehiculo(vehiculo1, numVeh);
                    break;

                case 2:
                    vehiculo2.metodoVehiculo(vehiculo2, numVeh);
                    break;

                case 3:
                    vehiculo3.metodoVehiculo(vehiculo3, numVeh);
                    break;

                case 4:
                    vehiculo4.metodoVehiculo(vehiculo4, numVeh);
                    break;

                case 5:
                    vehiculo5.metodoVehiculo(vehiculo5, numVeh);
                    break;
            }
            numVeh++;
        }
    }

}