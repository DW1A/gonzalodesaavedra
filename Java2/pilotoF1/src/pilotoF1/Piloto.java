package pilotoF1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Piloto {
	private String numeroLicencia;
	private String nombre;
	private String apellidos;
	private String nacionalidad;
	private ArrayList<Integer> puntosCarreras;

	// Constructor
	public Piloto(String numeroLicencia, String nombre, String apellidos, String nacionalidad) {
		this.numeroLicencia = numeroLicencia;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nacionalidad = nacionalidad;
		this.puntosCarreras = new ArrayList<>();
	}

	// Métodos para gestionar los puntos de las carreras
	public void setPuntosCarrera(int carrera, int puntos) {
		while (puntosCarreras.size() < carrera) {
			puntosCarreras.add(0); // Rellenar con ceros hasta la carrera actual
		}
		puntosCarreras.set(carrera - 1, puntos);
	}

	public int getPuntosTotales() {
		return puntosCarreras.stream().mapToInt(Integer::intValue).sum();
	}

	// Otros métodos de acceso
	public String getNumeroLicencia() {
		return numeroLicencia;
	}

	public String getNombreCompleto() {
		return apellidos + ", " + nombre;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}
}
