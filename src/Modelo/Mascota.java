package Modelo;

import java.util.ArrayList;

public class Mascota {

    //Atributos de la clase Mascota.
    private String nombre;
    private String especie;
    private int edad;
    private final ArrayList<Consulta> consultas; //lista de consultas para la mascota.

    //Constructor que inicializa lo datos de la mascota.
    public Mascota(String nombre, String especie, int edad) {
        //this.nombre = nombre;
        //this.especie = especie;
        //this.edad = edad;
        //el constructor inicializa los setters los cuales tienen las validaciones correspondientes
        setNombre(nombre);
        setEspecie(especie);
        setEdad(edad);
        this.consultas = new ArrayList<>();
    }

    //metodo que agrega una consulta a la lista de la mascota correspondiente.
    public void agregarConsulta(Consulta consulta) {
        if (consulta != null) {
            consultas.add(consulta);
        } else {
            System.out.println("Las Consultas no deben ser nulas.");
        }
    }

//metodo lo hice en la clase Historial oara separar responsabilidades.
//metodo que muestra la informacion del historial de la mascota.
//    public void mostrarHistorial() {
//        System.out.println("Mascota: " + nombre + " | Especie: " + especie + " | Edad Mascota: " + edad + " Años");
//        System.out.println("Historial de consultas: ");
//        for (int i = 0; i < consultas.size(); i++) {
//            consultas.get(i).mostrarDetalleConsulta();
//
//        }
//    }
    //getters y setters.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre no debe ser nulo ni vacio.");
        }
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        if (especie == null || especie.isBlank()) {
            throw new IllegalArgumentException("La especie no debe ser nula ni vacio.");
        }
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad <= 0) {
            throw new IllegalArgumentException("La edad no debe ser cero ni negativa.");
        } 
        this.edad = edad;
    }

    //el get muestra una copia de la lista original para que la original no sea modificable.
    public ArrayList<Consulta> getConsultas() {
        return new ArrayList<>(consultas);
    }

//    no es correcto dejar la lista espuesta a cambios desde otra clase.
//    public void setConsulta(ArrayList<Consulta> consulta) {
//        this.consultas = consulta;
//    }
}
