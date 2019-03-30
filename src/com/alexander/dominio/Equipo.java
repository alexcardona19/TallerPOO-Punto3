package com.alexander.dominio;
import java.util.*;

public class Equipo {

	private String nombre;
	private int partidosGanados;
	private int partidosPerdidos;
	private int partidosEmpatados;
	private int partidosJugados;
	private int goles;
	private ArrayList<Jugador> jugadores=new ArrayList<Jugador>();
	private ArrayList<Jugador> Posicion=new ArrayList<Jugador>();
	

	public Equipo(String nombre, int goles) {
		this.nombre = nombre;
		this.goles=goles;
	}
	
		
	public ArrayList<Jugador> buscarJugadorposicion(String posicion,String equipo){
		for (int i = 0; i < jugadores.size() ; i++) {
			if(jugadores.get(i).getPosicion().equals(posicion)) {
				Posicion.add(jugadores.get(i));
			}
		}
		return Posicion;
	}
	
	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}	
	
	public ArrayList<Jugador> getJugadoresPosicion() {
		return Posicion;
	}
	
	public void setPartidoG() {
		this.partidosGanados++;
	}
	
	public void setPartidoP() {
		this.partidosPerdidos++;
	}
	public void setPartidoE() {
		this.partidosEmpatados++;
	}
	
	public void setPartidosJ() {
		this.partidosJugados++;
	}
	
	public int getPartidosJ() {
		return partidosJugados;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setJugadores(Jugador jugador) {
		if(jugadores.size()<=16) {
			jugadores.add(jugador);
		}else {
			}
	}	
	public int getPartidosGanados() {
		return partidosGanados;
	}
	public int getPartidosPerdidos() {
		return partidosPerdidos;
	}
	public int getPartidosEmpatados() {
		return partidosEmpatados;
	}
	
	public int getGoles() {
		return goles;
	}
	public void setGoles(int goles) {
		this.goles = goles;
    }
}