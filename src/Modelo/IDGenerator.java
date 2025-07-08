package Modelo;

public class IDGenerator {

    //metodo que genera un numero de consulta aleatoria entre 1 a 1000.
    public static String consultaRandom() {
        int contadorConsulta = 0;
        return "C" + (++contadorConsulta);
    }
}
