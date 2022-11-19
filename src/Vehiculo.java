import java.util.Scanner;

public class Vehiculo {
    Scanner sc = new Scanner(System.in);
    String marca, modelo, motor, gasolina,placa;
    int numLlantas, numEspejos, numAsientos, anio;

    public void Vehiculo(){
        marca = "";
        modelo = "";
        motor = "";
        gasolina = "";
        placa = "";
        numAsientos = 0;
        numEspejos = 0;
        numLlantas = 0;
        anio = 0;
    }
    public String getMarca() {
        return marca;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getGasolina() {
        return gasolina;
    }

    public void setGasolina(String gasolina) {
        this.gasolina = gasolina;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNumLlantas() {
        return numLlantas;
    }

    public void setNumLlantas(int numLlantas) {
        this.numLlantas = numLlantas;
    }

    public int getNumEspejos() {
        return numEspejos;
    }

    public void setNumEspejos(int numEspejos) {
        this.numEspejos = numEspejos;
    }

    public int getNumAsientos() {
        return numAsientos;
    }

    public void setNumAsientos(int numCabinas) {
        this.numAsientos = numCabinas;
    }

    public void metodoVehiculo(Vehiculo newVehiculo, int num){
        System.out.println("\n\tMostrando Vehiculo " + num + ": ");
        System.out.println("Marca: " + newVehiculo.getMarca());
        System.out.println("Modelo: " + newVehiculo.getModelo());
        System.out.println("Año: " + newVehiculo.getAnio());
        System.out.println("Tipo de Motor: " + newVehiculo.getMotor());
        System.out.println("Gasolina que utiliza: " + newVehiculo.getGasolina());
        System.out.println("Placa: " + newVehiculo.getPlaca());
        System.out.println("Número de Asientos: " + newVehiculo.getNumAsientos());
        System.out.println("Número de Espejos: " + newVehiculo.getNumEspejos());
        System.out.println("Número de Llantas: " + newVehiculo.getNumLlantas());
    }
    public void setearVehiculo(Vehiculo newVehiculo, int num){
        System.out.println("\n\tIngresa los Datos del Vehiculo " + num + ": ");
        System.out.print("Marca: ");
        newVehiculo.setMarca(sc.next());
        System.out.print("Modelo: ");
        newVehiculo.setModelo(sc.next());
        System.out.print("Año: ");
        newVehiculo.setAnio(sc.nextInt());
        System.out.print("Tipo de Motor: ");
        newVehiculo.setMotor(sc.next());
        System.out.print("Gasolina que utiliza (en litros): ");
        newVehiculo.setGasolina(sc.next());
        System.out.print("Placa: ");
        newVehiculo.setPlaca(sc.next());
        System.out.print("Número de Asientos: ");
        newVehiculo.setNumAsientos(sc.nextInt());
        System.out.print("Número de Espejos: ");
        newVehiculo.setNumEspejos(sc.nextInt());
        System.out.print("Número de Llantas: ");
        newVehiculo.setNumLlantas(sc.nextInt());
    }

}
