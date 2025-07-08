package Modelo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//      Codigo Refactorizado.

//      instancia de la clase Scanner.
        Scanner entrada = new Scanner(System.in);
        GestorVeterinaria gestor = new GestorVeterinaria(entrada);
        Propietario propietario = gestor.registrarPropietario();
        gestor.registrarMascotaPropietario(propietario);
        ArrayList<Mascota> mascotas = propietario.getMascotas();
        for (int i = 0; i < mascotas.size(); i++) {
            gestor.registrarConsultaMascota(mascotas.get(i));
        }
        Historial.mostrarHistorialCompleto(propietario);
        entrada.close();
    }
    
    

//        Codigo Actividad Anterior.
//        Datos solicitados para el registro del propietario por consola.
//        System.out.println("====== Datos Propietario ========");
//        System.out.print("Ingrese su nombre: ");
//        String nombrePropietario = entrada.nextLine();
//        System.out.print("Ingrese N.Documento: ");
//        String documento = entrada.nextLine();
//        System.out.print("Ingrese N.Telefono: ");
//        String telefono = entrada.nextLine();
//        
//        instancia de la clase Propietario.
//        Propietario propietario = new Propietario(nombrePropietario, documento, telefono);
//        
//        validacion de numero de mascostas con un do while.
//        int numMascota;
//        do {
//            System.out.print("Ingrese el numero de mascotas a registrar: ");
//            while (!entrada.hasNextInt()) {
//                System.out.println("Ingrese un numero de Mascotas Valido.");
//                entrada.next(); //descarta la entrada incorrecta y pide de nuevo el dato
//            }
//            numMascota = entrada.nextInt();
//            entrada.nextLine();//limpia el salto de linea.
//            if (numMascota <= 0) {
//                System.out.println("El numero de mascotas no debe ser negativo ni cero.");
//            }
//        } while (numMascota <= 0);
//        
//        registro de las mascotas.
//        System.out.println("===== Datos Mascota =====");
//        for (int i = 0; i < numMascota; i++) {
//            System.out.println("Mascota # " + (i + 1));
//            System.out.print("Nombre Mascota: ");
//            String nombreMascota = entrada.nextLine();
//            System.out.print("Especie Mascota: ");
//            String especie = entrada.nextLine();
//            
//            Validacion de la edad de la mascota.
//            int edad;
//            do {
//                System.out.print("Edad Mascota: ");
//                while (!entrada.hasNextInt()) {
//                    System.out.println("Ingrese una edad valida.");
//                    entrada.next();
//                }
//                edad = entrada.nextInt();
//                entrada.nextLine();// limpia el salto de linea.
//                if (edad < 0) {
//                    System.out.println("La edad no puede ser negativa.");
//                }
//            } while (edad < 0);
//
//            Mascota mascota = new Mascota(nombreMascota, especie, edad);
//            
//            //validar las consultas de la mascota.
//            int numConsulta;
//            do {
//                System.out.println("Cuantas consultas desea para " + mascota.getNombre() + ":");
//                while (!entrada.hasNextInt()) {
//                    System.out.println("Ingrese un numero valido.");
//                    entrada.next();
//                }
//
//                numConsulta = entrada.nextInt();
//                entrada.nextLine();
//                if (numConsulta <= 0) {
//                    System.out.println("Las consultas no pueden ser negativas.");
//                }
//            } while (numConsulta <= 0);
//            
//            registro de las consultas de la mascota.
//            System.out.println("===== Registro Consulta =====");
//            for (int j = 0; j < numConsulta; j++) {
//                System.out.println("numero consulta: " + (j + 1));
//                System.out.print("Codigo de la Consulta: ");
//                String codigo = entrada.nextLine();
//                System.out.print("Fecha Consulta: ");
//                String fecha = entrada.nextLine();
//                System.out.print("Veterinario Responsable: ");
//                String nombreVeterinario = entrada.nextLine();
//                System.out.print("Especialidad: ");
//                String especialidad = entrada.nextLine();
//
//                Veterinario veterinario = new Veterinario(nombreVeterinario, especialidad);
//                Consulta consulta = new Consulta(codigo, fecha, veterinario);
//                mascota.agregarConsulta(consulta); //agrega la consulta a la mascota
//            }
//            propietario.agregarMascota(mascota); //agrega la mascota al propietario 
//        }
//        
//        //muestra toda la ficha con los datos del propietario y de sus mascotas correspondientes
//        System.out.println("\n---------------------------");
//        propietario.mostrarInformacionCompleta();
//        entrada.close();
//    }
}
