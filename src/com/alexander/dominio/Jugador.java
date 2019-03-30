package com.alexander.dominio;
public class Jugador {
	public String Nombre;
	public String Dorsal;
	public String Posicion;

	public Jugador(String nombre, String Dorsal, String Posicion) {
		this.Nombre = nombre;
		this.Dorsal = Dorsal;
		this.Posicion = Posicion;
	}
	public String getNombre() {
		return Nombre;
	}

	public String getDorsal() {
		return Dorsal;
	}
	
	public String getPosicion() {
		return Posicion;
	}
}