package Modelo;

import java.time.LocalDate;
import java.util.Scanner;

//Clase que se encarga de solicitar todos los datos de entrada de Propietario, Mascota y Consulta.
public class GestorVeterinaria {

    private Scanner entrada = new Scanner(System.in);

    public GestorVeterinaria(Scanner entrada) {
        this.entrada = entrada;
    }

    public Propietario registrarPropietario() {

        System.out.println("====== Datos Propietario ========");
        System.out.print("Ingrese su nombre: ");
        String nombrePropietario = entrada.nextLine();
        String documento;
        do {
            System.out.print("Ingrese N.Documento: ");
            documento = entrada.nextLine();
            if (documento.length() != 10) {
                System.out.println("Ingrese un numero de documento valido");
            }
        } while (documento.length() != 10);
        String telefono;
        do {
            System.out.print("Ingrese N.Telefeno: ");
            telefono = entrada.nextLine();
            if (telefono.length() != 10) {
                System.out.println("El telefono es invalido.");
            }
        } while (telefono.length() != 10);

        //instancia de la clase Propietario.
        Propietario propietario = new Propietario(nombrePropietario, documento, telefono);
        return propietario;
    }

    //registra la cantidad indicada de mascotas para el propietario.
    public void registrarMascotaPropietario(Propietario propietario) {

        //validacion de numero de mascostas con un do while.
        int numMascota;
        do {
            System.out.print("Ingrese el numero de mascotas a registrar: ");
            while (!entrada.hasNextInt()) {
                System.out.println("Ingrese un numero de Mascotas Valido.");
                entrada.next(); //descarta la entrada incorrecta y pide de nuevo el dato
            }
            numMascota = entrada.nextInt();
            entrada.nextLine();//limpia el salto de linea.
            if (numMascota <= 0) {
                System.out.println("debe ingresar al menos una mascota para su registro.");
            }
        } while (numMascota <= 0);
        for (int i = 0; i < numMascota; i++) {
            System.out.println("\n--- Registrando Mascota #" + (i + 1));
            Mascota mascota = registrarMascota();
            propietario.agregarMascota(mascota);
        }
    }

    public Mascota registrarMascota() {

        System.out.println("===== Datos Mascota =====");
        System.out.print("Nombre Mascota: ");
        String nombreMascota = entrada.nextLine();
        System.out.print("Especie Mascota: ");
        String especie = entrada.nextLine();

        int edad;
        do {
            System.out.print("Edad Mascota: ");
            while (!entrada.hasNextInt()) {
                System.out.println("Ingrese una edad válida.");
                entrada.next();
            }
            edad = entrada.nextInt();
            entrada.nextLine(); // limpiar salto de línea
            if (edad < 1 || edad > 50) {
                System.out.println("ingrese un dato de edad entr el rango 1 a 50.");
            }
        } while (edad < 1 || edad > 50);

        return new Mascota(nombreMascota, especie, edad);
    }

    public void registrarConsultaMascota(Mascota mascota) {

        System.out.println("\n--- Registrando consultas para la mascota: " + mascota.getNombre());

        int numConsultas;
        do {
            System.out.print("¿Cuántas consultas desea registrar para " + mascota.getNombre() + "?: ");
            while (!entrada.hasNextInt()) {
                System.out.println("Por favor, ingrese un número válido.");
                entrada.next();
            }
            numConsultas = entrada.nextInt();
            entrada.nextLine(); // limpia salto de línea
            if (numConsultas <= 0) {
                System.out.println("Debe registrar al menos una consulta.");
            }
        } while (numConsultas <= 0);

        for (int i = 0; i < numConsultas; i++) {
            System.out.println("\nConsulta #" + (i + 1));
            Consulta consulta = registrarConsulta();
            mascota.agregarConsulta(consulta);
        }
    }

    public Consulta registrarConsulta() {

        String codigoRandom = IDGenerator.consultaRandom();
        LocalDate fechaConsulta = LocalDate.now();
        System.out.print("Nombre Veterinario: ");
        String nombreVeterinario = entrada.nextLine();
        System.out.print("Especialidad: ");
        String Especialidad = entrada.nextLine();

        Veterinario veterinario = new Veterinario(nombreVeterinario, Especialidad);
        Consulta consulta = new Consulta(codigoRandom, fechaConsulta, veterinario);
        return consulta;
    }
}
