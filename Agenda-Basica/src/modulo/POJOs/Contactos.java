package modulo.POJOs;

import java.util.HashMap;

public class Contactos {
	private String nombre;
	public HashMap <String, Grupos>ListadoGrupos=new HashMap <String, Grupos>();
	public static HashMap <Integer, Contactos>Favoritos=new HashMap <Integer, Contactos>();
	private int numero;
	private boolean favorito;

	public Contactos(String nombre, int numero) {
		super();
		this.nombre = nombre;
		this.numero = numero;
	}

	public boolean isFavorito() {
		return favorito;
	}

	public void setFavorito(boolean favorito) {
		this.favorito = favorito;
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
