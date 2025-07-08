package Modelo;

import java.time.LocalDate;

public class Consulta {

    //Atributos de la clase Consulta.
    private String codigo;
    private LocalDate fecha;
    private Veterinario veterinario;// Relacion con la clase Veterinario.

    //constructor que crea una consulta con los datos de la clase Consulta y del Veterinario correspondiente.
    public Consulta(String codigo, LocalDate fecha, Veterinario veterinario) {
        //this.veterinario = veterinario;
        this.codigo = codigo;
        this.fecha = fecha;
        setVeterinario(veterinario);
    }

//    //Muestra los datos de la consulta correspondiente lo pase a la clase Historial.
//    public void mostrarDetalleConsulta() {
//        System.out.println("Codigo Consulta: " + codigo);
//        System.out.println("Fecha Consulta: " + fecha);
//        System.out.println("Veterinario Responsable: " + veterinario.getNombre() + "| Especialidad: " + veterinario.getEspecialidad());
//        System.out.println("");
//    }
    //getters y setters.
    public String getCodigo() {
        return codigo;
    }

//    no es necesario ya que el codigo se genera aleatoriamente.
//    public void setCodigo(String codigo) {
//        this.codigo = codigo;
//    }
    public LocalDate getFecha() {
        return fecha;
    }

    //no es neceario el setters ya que la fecha se genera automaticamente con LocalDate.now()
//    public void setFecha(LocalDate fecha) {
//        this.fecha = fecha;
//    }
    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        if (veterinario == null) {
            throw new IllegalArgumentException("El veterinario no debe ser nulo");
        }
        this.veterinario = veterinario;
    }
}
