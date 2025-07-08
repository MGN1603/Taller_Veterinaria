package Modelo;

public class Veterinario {

    //Atributos de la clase Veterinario.
    private String nombre;
    private String especialidad;

    //Constructor que inicializa los atributos.
    public Veterinario(String nombre, String especialidad) {
        //this.nombre = nombre;
        //this.especialidad = especialidad;
        setNombre(nombre);
        setEspecialidad(especialidad);
    }

    //metodos getters y setters.
    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("el nombre no debe ser nulo ni vacio");
        }
        this.nombre = nombre;
    }

    public void setEspecialidad(String especialidad) {
        if (especialidad == null || especialidad.isBlank()) {
            throw new IllegalArgumentException("La especialidad no debe ser nulo ni vacio");
        }
        this.especialidad = especialidad;
    }
    
}
