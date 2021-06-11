package TorneoUd.Clases;

import java.util.ArrayList;

public class Equipo {
	private String nombre;
	private byte puntosGanados = 0;
	

	public Equipo(String nombre, ArrayList<Jugador> jugadores) {
		this.nombre = nombre;
			
	}

	public void agregarPuntos(byte puntos) {
		this.puntosGanados += puntos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public byte getPuntosGanados() {
		return puntosGanados;
	}


	
}
