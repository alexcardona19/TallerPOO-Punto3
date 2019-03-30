package com.alexander.dominio;
import java.util.*;

public class Fecha {

	private ArrayList<Partido> Partidos = new ArrayList<Partido>();
	private ArrayList<Equipo> Equipos=new ArrayList<Equipo>();
	
	public Fecha(ArrayList<Partido> partidos) {
		if(partidos.size()<=2) {
			this.Partidos = partidos;
			}						
		}
	
	public ArrayList<Equipo> getEquipos() {
		return Equipos;
	}
	public ArrayList<Partido> getPartidos() {
		return Partidos;
	}
}

