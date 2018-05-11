package modulo.POJOs;

import java.util.HashMap;

public class Grupos {
	private String nombre;
	public static HashMap <String, Grupos>ListadoContactos=new HashMap <String, Grupos>();
	
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
