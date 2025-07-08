package Modelo;

import java.util.ArrayList;

public class Propietario {

    //Clase que representa al propietario de mascotas.
    private String nombre;
    private final String documento;
    private String telefono;
    private final ArrayList<Mascota> mascotas; //lista de las mascotas de los propietario.

    public Propietario(String nombre, String documento, String telefono) {
        //this.nombre = nombre;
        //this.telefono = telefono;
        //el constructor al inicializar el objeto valida que los setters se cumplan.
        setNombre(nombre);
        this.documento = documento;
        setTelefono(telefono);
        this.mascotas = new ArrayList<>();
    }

    //metodo para agregar una mascota a la lista.
    public void agregarMascota(Mascota mascota) {
        if (mascota != null) {
            mascotas.add(mascota);
        } else {
            System.out.println("Ingrese una mascota.");
        }
    }

    //este metodo lo pase a la clase Historial con el objetivo de separar la responsabilidades.
//    metodo para mostrar toda la informacion del  propietario y de sus mascotas correspondientes.
//    public void mostrarInformacionCompleta() {  
//        System.out.println("====== FICHA CLINICA =======");
//        System.out.println("Propietario: " + nombre);
//        System.out.println("Documento: " + documento);
//        System.out.println("Telefono: " + telefono);
//        System.out.println("");
//        for (int i = 0; i < mascotas.size(); i++) {
//            mascotas.get(i).mostrarHistorial();
//        }
//    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El Nombre no debe ser nulo ni vacio.");
        }
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

//    no esta bien tener un metodo modificador para el documento.    
//    public void setDocumento(String documento) {
//        this.documento = documento;
//    }
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if (telefono == null || telefono.isBlank()) {
            throw new IllegalArgumentException("El nombre no debe ser nulo ni vacio.");
        }
        this.telefono = telefono;
    }

    //este get muestra una copia de la lista mascotas para que la original no sea modificable.
    public ArrayList<Mascota> getMascotas() {
        return new ArrayList<>(mascotas);
    }

//    No esta bien dejar espuesta la lista de mascotas a su posible modificacion desde afuera.
//    public void setMascotas(ArrayList<Mascota> mascotas) {
//        this.mascotas = mascotas;
//    }
}
