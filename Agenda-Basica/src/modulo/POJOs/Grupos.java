package modulo.POJOs;

import java.util.HashMap;

public class Grupos {
	private String nombre;
	public static HashMap <Integer, Contactos>Participantes=new HashMap <Integer, Contactos>();
	
	public Grupos(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
