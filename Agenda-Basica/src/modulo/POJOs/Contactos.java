package modulo.POJOs;

import java.util.HashMap;

public class Contactos {
	private String nombre;
	public HashMap <String, Grupos>ListadoGrupos=new HashMap <String, Grupos>();
	private int numero;
	

	public Contactos(String nombre, int numero) {
		super();
		this.nombre = nombre;
		this.numero = numero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
}
