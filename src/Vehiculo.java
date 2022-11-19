public class Vehiculo {
    String marca, modelo, motor, gasolina,placa;
    int numLlantas, numEspejos, numCabinas;

    public void Vehiculo(){
        marca = "";
        modelo = "";
        motor = "";
        gasolina = "";
        placa = "";
        numCabinas = 0;
        numEspejos = 0;
        numLlantas = 0;
    }
    public String getMarca() {
        return marca;
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

    public int getNumCabinas() {
        return numCabinas;
    }

    public void setNumCabinas(int numCabinas) {
        this.numCabinas = numCabinas;
    }
}
