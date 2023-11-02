package Ejercicio12_2;

import java.util.ArrayList;

public class Jugador {
	
	String nombre;
	
	ArrayList<Ficha> ficha;
	
	public Jugador(String nombre,ArrayList<Ficha>ficha) {
		this.nombre=nombre;
		this.ficha=ficha;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Ficha> getFicha() {
		return ficha;
	}

	public void setFicha(ArrayList<Ficha> ficha) {
		this.ficha = ficha;
	}

}
