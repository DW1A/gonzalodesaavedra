package main;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import pilotoF1.Piloto;
import GestionPilotosF1.gestionPilotosF1;
import java.util.Scanner;

public class Main
{
	
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		int opcion;
     
        mostrarMenu();
        opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        
        while (opcion != 7)
        {
        	switch (opcion) 
            {
                case 1:
                    altaPiloto();
                    break;
                case 2:
                    ponerPuntosCarrera();
                    break;
                case 3:
                    añadirPuntosUltimaCarrera();
                    break;
                case 4:
                    listarPilotosPuntuacionBaja();
                    break;
                case 5:
                    mostrarPilotoPuntuacionAlta();
                    break;
                case 6:
                    mostrarPilotosOrdenAlfabetico();
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        }
}    

private static void mostrarMenu() {
    System.out.println("\n--- Menú ---");
    System.out.println("1. Alta de piloto");
    System.out.println("2. Poner puntos de un piloto en todas sus carreras");
    System.out.println("3. Añadir puntos de la última carrera hasta la fecha para un piloto");
    System.out.println("4. Listar datos de pilotos con puntuación más baja 5 en una carrera");
    System.out.println("5. Mostrar número de licencia del piloto con puntuación total más alta");
    System.out.println("6. Mostrar datos ordenados por orden alfabético de apellidos y nombre");
    System.out.println("7. Salir");
    System.out.print("Selecciona una opción: ");
}

private static void altaPiloto() {
	Scanner scanner=new Scanner(System.in);
	System.out.print("Número de licencia: ");
    String numeroLicencia = scanner.nextLine();

    System.out.print("Nombre: ");
    String nombre = scanner.nextLine();

    System.out.print("Apellidos: ");
    String apellidos = scanner.nextLine();

    System.out.print("Nacionalidad: ");
    String nacionalidad = scanner.nextLine();

    Piloto piloto = new Piloto(numeroLicencia, nombre, apellidos, nacionalidad);
    pilotos.add(piloto);

    System.out.println("Piloto dado de alta exitosamente.");
}

private static void ponerPuntosCarrera() 
{
	Scanner scanner=new Scanner(System.in);
    System.out.print("Número de licencia del piloto: ");
    String numeroLicencia = scanner.nextLine();
    Piloto piloto = buscarPiloto(numeroLicencia);

    if (piloto != null) {
        System.out.print("Número de carrera: ");
        int carrera = scanner.nextInt();
        System.out.print("Puntos obtenidos: ");
        int puntos = scanner.nextInt();

        piloto.setPuntosCarrera(carrera, puntos);
        System.out.println("Puntos asignados exitosamente.");
    } else {
        System.out.println("Piloto no encontrado.");
    }
}

private static void añadirPuntosUltimaCarrera() 
{
	Scanner scanner=new Scanner(System.in);
    System.out.print("Número de licencia del piloto: ");
    String numeroLicencia = scanner.nextLine();
    Piloto piloto = buscarPiloto(numeroLicencia);

    if (piloto != null) {
        int ultimaCarrera = piloto.getPuntosTotales() + 1;
        System.out.print("Puntos obtenidos en la última carrera (carrera " + ultimaCarrera + "): ");
        int puntos = scanner.nextInt();

        piloto.setPuntosCarrera(ultimaCarrera, puntos);
        System.out.println("Puntos añadidos exitosamente.");
    } else {
        System.out.println("Piloto no encontrado.");
    }
}

private static void listarPilotosPuntuacionBaja()
{
	Scanner scanner=new Scanner(System.in);
    System.out.print("Número de carrera: ");
    int carrera = scanner.nextInt();

    System.out.println("Pilotos con puntuación más baja de 5 en la carrera " + carrera + ":");
    for (Piloto piloto : pilotos) {
        if (piloto.getPuntosTotales() <= 5 && piloto.getPuntosCarreras().size() >= carrera && piloto.getPuntosCarreras().get(carrera - 1) <= 5) {
            mostrarDatosPiloto(piloto);
        }
    }
}

private static void mostrarPilotoPuntuacionAlta() {
    Piloto pilotoMaxPuntos = Collections.max(pilotos, Comparator.comparing(Piloto::getPuntosTotales));
    mostrarDatosPiloto(pilotoMaxPuntos);
}

private static void mostrarPilotosOrdenAlfabetico() {
    ArrayList<Piloto> pilotosOrdenados = new ArrayList<>(pilotos);
    Collections.sort(pilotosOrdenados, Comparator.comparing(Piloto::getApellidos).thenComparing(Piloto::getNombre));

    System.out.println("Datos de los pilotos ordenados alfabéticamente:");
    for (Piloto piloto : pilotosOrdenados) {
        mostrarDatosPiloto(piloto);
    }
}

private static Piloto buscarPiloto(String numeroLicencia) {
    for (Piloto piloto : pilotos) {
        if (piloto.getNumeroLicencia().equals(numeroLicencia)) {
            return piloto;
        }
    }
    return null;
}

private static void mostrarDatosPiloto(Piloto piloto) {
    System.out.println("Número de licencia: " + piloto.getNumeroLicencia());
    System.out.println("Nombre completo: " + piloto.getNombreCompleto());
    System.out.println("Nacionalidad: " + piloto.getNacionalidad());
    System.out.println("Puntuación total: " + piloto.getPuntosTotales());
    System.out.println();
}
}
}