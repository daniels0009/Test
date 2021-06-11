package Core;

import java.util.ArrayList;
import java.util.Arrays;

import TorneoUd.Clases.Equipo;
import TorneoUd.Clases.Fecha;
import TorneoUd.Clases.Jugador;
import TorneoUd.Clases.Partido;
import TorneoUd.Clases.Torneo;
public class Aplicacion {

	public static void main(String[] args) {
                
		Torneo championsleague = new Torneo("Torneo de Prueba");
		Fecha fechaNro1 = new Fecha();
		Fecha fechaNro2 = new Fecha();
		Fecha fechaNro3 = new Fecha();
 
           
		


		ArrayList<Jugador> conjuntojugadores1 = new ArrayList<Jugador>(
				Arrays.asList());
		
		
	

		ArrayList<Jugador> conjuntojugadores2 = new ArrayList<Jugador>(
				Arrays.asList());
		
		

		ArrayList<Jugador> conjuntojugadores3 = new ArrayList<Jugador>(
				Arrays.asList());
		
		

		ArrayList<Jugador> conjuntojugadores4 = new ArrayList<Jugador>(
				Arrays.asList());
		
		
		

		Equipo UD1= new Equipo("UD1", conjuntojugadores1);
		Equipo UD2 = new Equipo("UD2", conjuntojugadores2);
		Equipo UD3 = new Equipo("UD3", conjuntojugadores3);
		Equipo UD4 = new Equipo("UD4", conjuntojugadores4);
		ArrayList<Equipo> equipos = new ArrayList<Equipo>(Arrays.asList(UD1, UD2, UD3, UD4));
		championsleague.setEquipos(equipos);

		Partido partido1 = new Partido(UD1, UD2);
		Partido partido2 = new Partido(UD1, UD3);
		Partido partido3 = new Partido(UD4, UD2);
		Partido partido4 = new Partido(UD1, UD4);
		Partido partido5 = new Partido(UD3, UD2);
		Partido partido6 = new Partido(UD4, UD3);

		ArrayList<Partido> partidosFecha1 = new ArrayList<Partido>(Arrays.asList(partido1, partido2));
		ArrayList<Partido> partidosFecha2 = new ArrayList<Partido>(Arrays.asList(partido3, partido4));
		ArrayList<Partido> partidosFecha3 = new ArrayList<Partido>(Arrays.asList(partido5, partido6));

		fechaNro1.setPartidos(partidosFecha1);
		fechaNro2.setPartidos(partidosFecha2);
		fechaNro3.setPartidos(partidosFecha3);

		ArrayList<Fecha> fechas = new ArrayList<Fecha>(Arrays.asList(fechaNro1, fechaNro2, fechaNro3));

		championsleague.setFechas(fechas);

		championsleague.comenzarTorneo();

		System.out.println("Equipos del torneo: ");
		for (int i = 0; i < 4; i++) {
			System.out.println(championsleague.getEquipos().get(i).getNombre());
		}
		System.out.println("\nGanadores de cada fecha:");
		for (int i = 0; i < 3; i++) {
			System.out.println("Fecha #" + (i + 1));
			for (int j = 0; j < 2; j++) {
				if (championsleague.getFechas().get(i).getPartidos().get(j).getGanador() == null) {
					System.out.println("Hubo un empate entre:  "
							+ championsleague.getFechas().get(i).getPartidos().get(j).getEquipoLocal().getNombre() + " y "
							+ championsleague.getFechas().get(i).getPartidos().get(j).getEquipoVisitante().getNombre());
				} else {
					System.out.println(
							"Ganador: " + championsleague.getFechas().get(i).getPartidos().get(j).getGanador().getNombre()
									+ " // Perdedor: "
									+ championsleague.getFechas().get(i).getPartidos().get(j).getPerdedor().getNombre());
				}

			}
			System.out.println("\n");
		}


		System.out.println("\n");
		ArrayList<String> resultados = championsleague.verResultado();
		for (int i = 0; i < 8; i++) {
			System.out.println("Equipo: " + resultados.get(i) + " // Puntos: " + resultados.get(i + 1));
			i++;
		}
		System.out.println("Campeon: " + resultados.get(8) + "\n");
	}

}
