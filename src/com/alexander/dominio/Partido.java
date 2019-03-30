package com.alexander.dominio;


import java.util.*;

public class Partido {
	private Equipo Equipo1;
	private Equipo Equipo2;
	private ArrayList<Equipo> Equipos=new ArrayList<Equipo>();
	
	public Partido(ArrayList<Equipo> equipos) {
		super();
		
		if(equipos.size()<=2) {
			this.Equipos = equipos;
		}		
	}

	public void resultadoPartido()
	{
		for (int j = 0; j < 1; j++) {
			if (Equipos.get(j).getGoles()>Equipos.get(j+1).getGoles()) {
				this.Equipo1=Equipos.get(j);
				Equipos.get(j).setPartidoG();
				Equipos.get(j).setGoles(Equipos.get(j).getGoles()+2);
				this.Equipo2=Equipos.get(j+1);
				Equipos.get(j+1).setGoles(Equipos.get(j+1).getGoles()+1);
				Equipos.get(j+1).setPartidoP();
			}if (Equipos.get(j).getGoles()<Equipos.get(j+1).getGoles()){
				this.Equipo1=Equipos.get(j+1);
				Equipos.get(j+1).setPartidoG();
				Equipos.get(j+1).setGoles(Equipos.get(j+1).getGoles()+2);
				this.Equipo2=Equipos.get(j);
				Equipos.get(j).setPartidoP();
				Equipos.get(j).setGoles(Equipos.get(j).getGoles()+1);
			}
		}
	}
	public ArrayList<Equipo> getEquipos() {
		return Equipos;
	}
	public Equipo getEquipo1() {
		return Equipo1;
	}
	public Equipo getEquipo2() {
		return Equipo2;
}
}