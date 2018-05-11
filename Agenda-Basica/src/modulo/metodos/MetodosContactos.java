package modulo.metodos;

import java.util.HashMap;

import modulo.POJOs.Contactos;

public class MetodosContactos {
	public static HashMap <Integer, Contactos>ContactosGrupo=new HashMap <Integer, Contactos>();

	public void AnadirContacto(int numero, String nombre) {
		Contactos contacto=new Contactos(nombre ,numero);
		ContactosGrupo.put(numero, contacto);
		
	}


	public void EliminarContacto(int numero) {
		ContactosGrupo.remove(numero);

		
	}
	
	public void modificarContacto(String nombre, int numero, int numeroAntiguo) {
		ContactosGrupo.remove(numeroAntiguo);
		Contactos contacto=new Contactos(nombre ,numero);
		ContactosGrupo.put(numero, contacto);
	}
	public void anadirFavoritos(int numero) {
		Contactos.Favoritos.put(numero, ContactosGrupo.get(numero));
	}
	public void eliminarFavoritos(int numero) {
		Contactos.Favoritos.remove(numero);
	}
}
