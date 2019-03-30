package com.alexander.dominio;
import java.util.*;

public class Torneo {

	private String Nombre = "Torneo FoxSport";
	private ArrayList<Equipo> Equipos = new ArrayList<Equipo>();
	private ArrayList<Fecha> Fechas = new ArrayList<Fecha>();

	
	public Torneo(ArrayList<Equipo> equipos, ArrayList<Fecha> fechas) {
		this.Equipos = equipos;
		this.Fechas = fechas;
		
	}	

	public void setEquipos(ArrayList<Equipo> equipos) {
		if(equipos.size()<=2) {
			this.Equipos = equipos;
		}else {
			System.out.println("Limite de Equipos excedido");
		}
	}
	public void setFechas(ArrayList<Fecha> fechas) {
		if (fechas.size()<=3) {
			this.Fechas = fechas;
		}else {
			System.out.println("Limite de fechas excedido");
		}
	}
	public ArrayList<Equipo> getEquipos() {
		return Equipos;
	}
	public ArrayList<Fecha> getFechas() {
		return Fechas;
	}
	public String getNombre() {
		return Nombre;
}

}