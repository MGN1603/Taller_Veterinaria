package Modelo;

import java.util.ArrayList;

//clase Historial la cual su objetivo es mostrar la informacion correspondiente o ficha clinica de la mascota de cada propietario.
public class Historial {
   
    public static void mostrarHistorialCompleto(Propietario propietario) {
        
        System.out.println("====== FICHA CLINICA =======");
        System.out.println("Propietario: " + propietario.getNombre());
        System.out.println("Documento: " + propietario.getDocumento());
        System.out.println("Telefono: " + propietario.getTelefono());
        System.out.println("");
        ArrayList<Mascota> mascotas = propietario.getMascotas();
        for (int i = 0; i < mascotas.size(); i++) {
            Historial.mostrarHistorialMascota(mascotas.get(i));
        }
    }

    public static void mostrarHistorialMascota(Mascota mascota) {
        
        System.out.println("Mascota: " + mascota.getNombre() + " | Especie: " + mascota.getEspecie()
                + " | Edad Mascota: " + mascota.getEdad() + " Años");
        System.out.println("Historial de consultas: ");
        ArrayList<Consulta> consultas = mascota.getConsultas();
        for (Consulta consulta : consultas) {
            mostrarDetalleConsulta(consulta);
        }
    }

    public static void mostrarDetalleConsulta(Consulta consulta) {
        
        System.out.println("Codigo Consulta: " + consulta.getCodigo());
        System.out.println("Fecha Consulta: " + consulta.getFecha());
        Veterinario vet = consulta.getVeterinario();
        System.out.println("Veterinario Responsable: " + vet.getNombre() + " | Especialidad: " + vet.getEspecialidad());
        System.out.println();
    }
}
